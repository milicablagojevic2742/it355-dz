/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.model;

import java.io.Serializable;

/**
 *
 * @author Blagojevic Milica
 */
public class Deo implements Serializable{
    
    private int sifra;
    private String ime;
    private double cena;
    private String proizvodjac;
    private int kategorija_id;

    public Deo() {
    }

    public Deo(int sifra, String ime, double cena, String proizvodjac, int kategorija_id) {
        this.sifra = sifra;
        this.ime = ime;
        this.cena = cena;
        this.proizvodjac = proizvodjac;
        this.kategorija_id = kategorija_id;
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

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public int getKategorija_id() {
        return kategorija_id;
    }

    public void setKategorija_id(int kategorija_id) {
        this.kategorija_id = kategorija_id;
    }

    @Override
    public String toString() {
        return "Deo{" + "sifra=" + sifra + ", ime=" + ime + ", cena=" + cena + ", proizvodjac=" + proizvodjac + ", kategorija_id=" + kategorija_id + '}';
    }
    
    
}
