/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.aop;

/**
 *
 * @author Blagojevic Milica
 */
public class DeoDodajImpl implements DeoDodaj {

    @Override
    public void addDeo() {
        System.out.println("Dodavanje dela...");
    }

    @Override
    public String addDeoRet() {
        System.out.println("Dodavanje dela i vracanje poruke...");
        return "Dodat deo";
    }

    @Override
    public void addDeoThrowException() throws Exception {
        System.out.println("Dodavanje dela i izbacivanje greske...");
        throw new Exception("Generic Exception");
    }

    @Override
    public void addDeoAround(String name) {
        System.out.println("Dodavanje dela sa imenom: " + name);
    }

}
