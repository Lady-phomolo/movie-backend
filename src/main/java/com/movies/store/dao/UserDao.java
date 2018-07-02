/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.store.dao;

import com.movies.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author phomolo
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByPasswordAndEmail(String email, String Password);
}
