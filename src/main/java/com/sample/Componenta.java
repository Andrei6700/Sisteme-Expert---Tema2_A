package com.sample;

public class Componenta {
    private String tip;
    private String caracteristica;
    private double pret;

    public Componenta(String tip, String caracteristica, double pret) {
        this.tip = tip;
        this.caracteristica = caracteristica;
        this.pret = pret;
    }
    public String getTip() { return tip; }
    public String getCaracteristica() { return caracteristica; }
    public double getPret() { return pret; }
}
