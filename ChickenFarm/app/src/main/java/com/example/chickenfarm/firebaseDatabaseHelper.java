package com.example.chickenfarm;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class firebaseDatabaseHelper {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReferenceMonitoring;
    private List<monitoring> monitorings = new ArrayList<>();

    public firebaseDatabaseHelper() {
        mDatabase = FirebaseDatabase.getInstance();
        mReferenceMonitoring = mDatabase.getReference("monitorings");

    }
}
