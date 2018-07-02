/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.Controller;

import com.movies.store.entities.User;
import com.movies.store.service.Impl.UserServiceImpl;
import com.movies.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author phomolo
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {
    
 
    @Autowired
    UserService service;
    
    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public String register(@RequestBody User u){
        if(service.register(u)){
            return "good";
        }else{
            return "email is not available";
        }          
        
    }
    
    @RequestMapping("/login/{email}/{password}")
    public User login(@PathVariable String email ,@PathVariable String password ){
        return service.login(email, password);
    }
}
