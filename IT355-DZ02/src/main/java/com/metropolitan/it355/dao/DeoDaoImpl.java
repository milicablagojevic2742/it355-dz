/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.dao;

import com.metropolitan.it355.mapper.DeoMapper;
import com.metropolitan.it355.model.Deo;
import java.util.List;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Milica Blagojevic
 */
public class DeoDaoImpl implements DeoDao{
    
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Transactional
    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM deo";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Transactional
    @Override
    public List<Deo> getAllDeo() {
        String sql = "SELECT * FROM deo";
        List<Deo> delovi = jdbcTemplate.query(sql, new DeoMapper());
        return delovi;
    }

    @Transactional
    @Override
    public boolean addDeo(Deo deo) {
        String sql = "INSERT INTO deo (imeDeo, cenaDeo, proizvodjacDeo, kategorija_id) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{deo.getIme(), deo.getCena(), deo.getProizvodjac(), deo.getKategorija_id()});
        return true;
    }
    
    @Override
    public boolean editDeo(Deo deo){
        String sql = "UPDATE deo SET deo_id=?, imeDeo=?, cenaDeo=?, proizvodjacDeo=?, kategorija_id=? WHERE deo_id=?";
        jdbcTemplate.update(sql, new Object[]{deo.getSifra(), deo.getIme(), deo.getCena(), deo.getProizvodjac(), deo.getKategorija_id(), deo.getSifra()});
        return true;
    }
    
    @Override
    public boolean deleteDeo(Deo deo){
        String sql = "DELETE FROM deo WHERE deo_id=?";
        jdbcTemplate.update(sql, new Object[]{deo.getSifra()});
        return true;
    }

    @Override
    @Transactional
    public Deo getDeoByID(int ID) {
        String sql = "SELECT * FROM deo WHERE deo_id=" + ID;
        List<Deo> delovi = jdbcTemplate.query(sql, new DeoMapper());
        return delovi.get(0);
    }
    
}
