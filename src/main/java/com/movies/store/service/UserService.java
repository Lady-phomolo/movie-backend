/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.service;

import com.movies.store.entities.User;

/**
 *
 * @author phomolo
 */
public interface UserService {

    boolean register(User u);

    User login(String email, String password);
}
