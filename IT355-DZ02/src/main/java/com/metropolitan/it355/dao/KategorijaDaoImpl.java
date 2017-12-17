/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.dao;

import com.metropolitan.it355.mapper.KategorijaMapper;
import com.metropolitan.it355.model.Kategorija;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Milica Blagojevic
 */
public class KategorijaDaoImpl implements KategorijaDao {
    
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM kategorija";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Kategorija> getAllKategorija() {
        String sql = "SELECT * FROM kategorija";
        List<Kategorija> kategorije = jdbcTemplate.query(sql, new KategorijaMapper());
        return kategorije;
    }

    @Override
    public boolean addDeo(Kategorija kategorija) {
        String sql = "INSERT INTO kategorija (imeKategorije) VALUES (?)";
        jdbcTemplate.update(sql, new Object[]{kategorija.getImeKategorije()});
        return true;
    }
    
    @Override
    public boolean editKategorija(Kategorija kategorija) {
        String sql = "UPDATE kategorija SET kategorija_id=?, imeKategorije=? WHERE kategorija_id=?";
        jdbcTemplate.update(sql, new Object[]{kategorija.getKategorija_id(), kategorija.getImeKategorije(), kategorija.getKategorija_id()});
        return true;
    }
    
    @Override
    public boolean deleteKategorija(Kategorija kategorija) {
        String sql = "DELETE FROM kategorija WHERE kategorija_id=?";
        jdbcTemplate.update(sql, new Object[]{kategorija.getKategorija_id()});
        return true;
    }

    @Override
    public Kategorija getKategorijaByID(int ID) {
        String sql = "SELECT * FROM kategorija WHERE kategorija_id =" + ID;
        List<Kategorija> kategorije = jdbcTemplate.query(sql, new KategorijaMapper());
        return kategorije.get(0);
    }
    
}
