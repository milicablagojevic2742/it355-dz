/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.model;

/**
 *
 * @author Blagojevic Milica
 */
public class Deo {
    
    private int sifra;
    private String ime;
    private double cena;

    public Deo() {
    }

    public Deo(int sifra, String ime, double cena) {
        this.sifra = sifra;
        this.ime = ime;
        this.cena = cena;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Deo{" + "sifra=" + sifra + ", ime=" + ime + ", cena=" + cena + '}';
    }
    
    
}
