package com.java.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.java.demo.model.UserData;

public interface UserService {

	public UserData saveUser(UserData user);
	public List<UserData> getAllUSer();
	public UserData updateUser(UserData userData, long id);
}
