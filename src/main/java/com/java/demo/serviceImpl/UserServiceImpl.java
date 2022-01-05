package com.java.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.demo.dao.UserDao;
import com.java.demo.model.UserData;
import com.java.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	@Override
	public UserData saveUser(UserData user) {
		
		return dao.save(user);
	}
	@Override
	public List<UserData> getAllUSer() {
		
		return dao.findAll();
	}

}
