/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.it355.dz02;

import java.io.Serializable;

/**
 *
 * @author Blagojevic Milica
 */
public class MarkaBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String marka;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "MarkaBean{" + "marka=" + marka + '}';
    }
    
    
}
