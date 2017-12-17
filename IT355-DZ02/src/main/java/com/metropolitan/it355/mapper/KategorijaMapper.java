/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.mapper;

import org.springframework.jdbc.core.RowMapper;
import com.metropolitan.it355.model.Kategorija;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Milica Blagojevic
 */
public class KategorijaMapper implements RowMapper<Kategorija> {
    
    @Override
    public Kategorija mapRow(ResultSet rs, int i) throws SQLException {
        Kategorija kateg = new Kategorija();
        kateg.setKategorija_id(rs.getInt("kategorija_id"));
        kateg.setImeKategorije(rs.getString("imeKategorije"));
        return kateg;
    }
    
}
