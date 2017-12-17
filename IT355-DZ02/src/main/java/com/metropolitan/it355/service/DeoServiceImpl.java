/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.service;

import com.metropolitan.it355.dao.DeoDao;
import com.metropolitan.it355.model.Deo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Milica Blagojevic
 */
public class DeoServiceImpl implements DeoService{
    
    @Autowired
    DeoDao deoDao;

    @Override
    public int getCount() {
        return deoDao.getCount();
    }

    @Override
    public List<Deo> getAllDeo() {
        return deoDao.getAllDeo();
    }

    @Override
    public boolean addDeo(Deo deo) {
        return deoDao.addDeo(deo);
    }
    
    @Override
    public boolean editDeo(Deo deo){
         return deoDao.editDeo(deo);
    }
    
    @Override
    public boolean deleteDeo(Deo deo){
        return deoDao.deleteDeo(deo);
    }

    @Override
    public Deo getDeoByID(int ID) {
        return deoDao.getDeoByID(ID);
    }
    
}
