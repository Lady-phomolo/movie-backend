/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.service.Impl;

import com.movies.store.dao.UserDao;
import com.movies.store.entities.User;
import com.movies.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phomolo
 */
@Service
public  class UserServiceImpl implements UserService{
     @Autowired
    UserDao userDao;
     
     public boolean register(User u){
         if(userDao.findByEmail(u.getEmail()) != null){
             return false;
         }
         else{
             userDao.save(u);
             return true;
         }
         
     }
     
     public User login(String email , String password){
          return userDao.findByPasswordAndEmail(email, password);
     }
}
