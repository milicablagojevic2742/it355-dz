/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.service;

import com.metropolitan.it355.model.User;
import com.metropolitan.it355.dao.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Milica Blagojevic
 */
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserDao userDao;

    @Override
    public int getCount() {
        return userDao.getCount();
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public boolean addUser(User u) {
        return userDao.addUser(u);
    }
    
    @Override
    public boolean editUser(User u) {
        return userDao.editUser(u);
    }
    
    @Override
    public boolean deleteUser(User u) {
        return userDao.deleteUser(u);
    }

    @Override
    public User getUserByID(int ID) {
        return userDao.getUserByID(ID);
    }
    
}
