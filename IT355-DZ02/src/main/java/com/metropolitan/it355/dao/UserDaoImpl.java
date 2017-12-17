/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.dao;

import com.metropolitan.it355.mapper.UserMapper;
import com.metropolitan.it355.model.User;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Milica Blagojevic
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM users";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users";
        List<User> users = jdbcTemplate.query(sql, new UserMapper());
        return users;
    }

    @Override
    public boolean addUser(User user) {
        String sql = "INSERT INTO users " + "(username, password, enabled) VALUES (?, ?, 1)";
        jdbcTemplate.update(sql, new Object[]{user.getUsername(), user.getPassword()});
        String sql1 = "INSERT INTO user_roles (user_id, role) VALUES (?, 'ROLE_USER')";
        jdbcTemplate.update(sql1, new Object[]{user.getUser_id()});
        return true;
    }
    
    @Override
    public boolean editUser(User user) {
        String sql = "UPDATE users SET username=?, password=? WHERE user_id=?";
        jdbcTemplate.update(sql, new Object[]{user.getUsername(), user.getPassword(), user.getUser_id()});
        return true;
    }
    
    @Override
    public boolean deleteUser(User user) {
        String sql = "DELETE FROM users WHERE user_id=?";
        jdbcTemplate.update(sql, new Object[]{user.getUser_id()});
        return true;
    }

    @Override
    public User getUserByID(int ID) {
        String sql = "SELECT * FROM users WHERE user_id=" + ID;
        List<User> users = jdbcTemplate.query(sql, new UserMapper());
        return users.get(0);
    }

}
