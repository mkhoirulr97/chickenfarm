package com.example.chickenfarm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference amonias;
    private DatabaseReference kelembapans;
    private DatabaseReference celsiuss;
    private DatabaseReference fahrenheits;
    private DatabaseReference waktus;
    //    private Button btnRead;
    private TextView amonia;
    private TextView kelembapan;
    private TextView celsius;
    private TextView fahrenheit;
    private TextView waktu;

    Switch aSwitch;
    Button on;
    Button off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnRead = findViewById(R.id.btnRead);
        amonia = findViewById(R.id.amonia);
        kelembapan = findViewById(R.id.kelembapan);
        celsius = findViewById(R.id.suhu_celcius);
        fahrenheit = findViewById(R.id.suhu_fahrenheit);
        waktu = findViewById(R.id.waktu_rekam);

        amonias = FirebaseDatabase.getInstance().getReference().child("Show Data/amonia ");
        kelembapans = FirebaseDatabase.getInstance().getReference().child("Show Data/kelembapan ");
        celsiuss = FirebaseDatabase.getInstance().getReference().child("Show Data/sensor suhu celsius ");
        fahrenheits = FirebaseDatabase.getInstance().getReference().child("Show Data/sensor suhu farenheit ");
        waktus = FirebaseDatabase.getInstance().getReference().child("Show Data/waktu rekam ");

//        on = (Button) findViewById(R.id.on);
//        off = (Button) findViewById(R.id.off);
//        on.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseDatabase database = FirebaseDatabase.getInstance();
//                DatabaseReference myRef = database.getReference("FBStatus");
//
//                myRef.setValue("ON");
//            }
//        });
//        off.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseDatabase database = FirebaseDatabase.getInstance();
//                DatabaseReference myRef = database.getReference("FBStatus");
//
//                myRef.setValue("OFF");
//            }
//        });

        amonias.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String data =snapshot.getValue().toString();
                    amonia.setText(data);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        kelembapans.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String data=snapshot.getValue().toString();
                    kelembapan.setText(data);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        celsiuss.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String data=snapshot.getValue().toString();
                    celsius.setText(data);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        fahrenheits.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String data=snapshot.getValue().toString();
                    fahrenheit.setText(data);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        waktus.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String data=snapshot.getValue().toString();
                    waktu.setText(data);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        setContentView(R.layout.activity_main);
        aSwitch = findViewById(R.id.idswitch);

//        on = (Button) findViewById(R.id.on);
//        off = (Button) findViewById(R.id.off);
//        on.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseDatabase database = FirebaseDatabase.getInstance();
//                DatabaseReference myRef = database.getReference("Show Data/Status");
//
//                myRef.setValue("ON");
//            }
//        });
//        off.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseDatabase database = FirebaseDatabase.getInstance();
//                DatabaseReference myRef = database.getReference("Show Data/Status");
//
//                myRef.setValue("OFF");
//           }
//        });
    }

    public void onSwitchClick(View view){
        if (aSwitch.isChecked()){
            Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
        }

    }
}