/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.service;

import com.metropolitan.it355.dao.KategorijaDao;
import com.metropolitan.it355.model.Kategorija;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Milica Blagojevic
 */
public class KategorijaServiceImpl implements KategorijaService {
    
    @Autowired
    KategorijaDao kategorijaDao;

    @Override
    public int getCount() {
        return kategorijaDao.getCount();
    }

    @Override
    public List<Kategorija> getAllKategorija() {
        return kategorijaDao.getAllKategorija();
    }

    @Override
    public boolean addKategorija(Kategorija k) {
        return kategorijaDao.addDeo(k);
    }
    
    @Override
    public boolean editKategorija(Kategorija k) {
        return kategorijaDao.editKategorija(k);
    }
    
    @Override
    public boolean deleteKategorija(Kategorija k) {
        return kategorijaDao.deleteKategorija(k);
    }

    @Override
    public Kategorija getKategorijaByID(int ID) {
        return kategorijaDao.getKategorijaByID(ID);
    }
    
}
