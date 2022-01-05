package com.java.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.demo.model.UserData;


public interface UserDao extends JpaRepository<UserData, Long>{

}
