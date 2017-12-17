/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.dao;

import com.metropolitan.it355.model.Deo;
import java.util.List;

/**
 *
 * @author Milica Blagojevic
 */
public interface DeoDao {
    
    public int getCount();

    public List<Deo> getAllDeo();

    public boolean addDeo(Deo deo);
    
    public boolean editDeo(Deo deo);
    
    public boolean deleteDeo(Deo deo);

    public Deo getDeoByID(int ID);
    
}
