/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.dao;

import com.metropolitan.it355.model.User;
import java.util.List;

/**
 *
 * @author Milica Blagojevic
 */
public interface UserDao {
    
    public int getCount();

    public List<User> getAllUsers();

    public boolean addUser(User user);
    
    public boolean editUser(User user);
    
    public boolean deleteUser(User user);

    public User getUserByID(int ID);
    
}
