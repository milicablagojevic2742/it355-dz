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
public interface DeoDodaj {

    public void addDeo();

    public String addDeoRet();

    public void addDeoThrowException() throws Exception;

    public void addDeoAround(String name);

}
