/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.model;

import java.io.Serializable;

/**
 *
 * @author Milica Blagojevic
 */
public class Kategorija implements Serializable{
    
    private int kategorija_id;
    private String imeKategorije;

    public Kategorija() {
    }

    public Kategorija(int kategorija_id, String imeKategorije) {
        this.kategorija_id = kategorija_id;
        this.imeKategorije = imeKategorije;
    }

    public int getKategorija_id() {
        return kategorija_id;
    }

    public void setKategorija_id(int kategorija_id) {
        this.kategorija_id = kategorija_id;
    }

    public String getImeKategorije() {
        return imeKategorije;
    }

    public void setImeKategorije(String imeKategorije) {
        this.imeKategorije = imeKategorije;
    }

    @Override
    public String toString() {
        return "Kategorija{" + "kategorija_id=" + kategorija_id + ", imeKategorije=" + imeKategorije + '}';
    }
    
}
