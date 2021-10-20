package com.company;

public class Zalobce {
    private int rok;
    private String zalobce;
    private double castka;

    public Zalobce(int rok, String zalobce, double castka) {
        this.rok = rok;
        this.zalobce = zalobce;
        this.castka = castka;
    }

    public int getRok() {
        return rok;
    }

    public String getZalobce() {
        return zalobce;
    }

    public double getCastka() {
        return castka;
    }
}
