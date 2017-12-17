/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.model;

import java.io.Serializable;

/**
 *
 * @author Milica Blagojevic
 */
public class User implements Serializable{
    
    private int user_id;
    private String username;
    private String password;
    private int enabled;

    public User() {
    }

    public User(int user_id, String username, String password, int enabled) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", enabled=" + enabled + '}';
    }
}
