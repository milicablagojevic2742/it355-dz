/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.mapper;

import org.springframework.jdbc.core.RowMapper;
import com.metropolitan.it355.model.Deo;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Milica Blagojevic
 */
public class DeoMapper implements RowMapper<Deo>{
    
    @Override
    public Deo mapRow(ResultSet rs, int i) throws SQLException {
        Deo deo = new Deo();
        deo.setSifra(rs.getInt("deo_id"));
        deo.setIme(rs.getString("imeDeo"));
        deo.setCena(rs.getInt("cenaDeo"));
        deo.setProizvodjac(rs.getString("proizvodjacDeo"));
        deo.setKategorija_id(rs.getInt("kategorija_id"));
        return deo;
    }
    
}
