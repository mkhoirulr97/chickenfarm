package com.example.chickenfarm;

public class monitoring {
    private String amonia;
    private String kelembapan;
    private String celsius;
    private String fahrenheit;
    private String waktu;

    public monitoring() {
    }

    public monitoring(String amonia, String kelembapan, String celsius, String fahrenheit, String waktu) {
        this.amonia = amonia;
        this.kelembapan = kelembapan;
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.waktu = waktu;
    }

    public String getAmonia() {
        return amonia;
    }

    public void setAmonia(String amonia) {
        this.amonia = amonia;
    }

    public String getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(String kelembapan) {
        this.kelembapan = kelembapan;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
