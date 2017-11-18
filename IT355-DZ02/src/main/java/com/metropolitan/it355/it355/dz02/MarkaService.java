/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.it355.dz02;

import org.springframework.stereotype.Service;

/**
 *
 * @author Blagojevic Milica
 */
@Service
public class MarkaService {
    
    public String proveraMarke(MarkaBean mBean) {
        String marka = mBean.getMarka();
        if (marka.equals("Audi")) {
            return "true";
        } else {
            return "false";
        }
    }
}
