package com.java.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.demo.model.User;

public interface UserDao extends JpaRepository<User, Long>{

}
