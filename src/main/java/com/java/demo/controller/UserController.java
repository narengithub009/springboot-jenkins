package com.java.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.java.demo.model.UserData;
import com.java.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService service;
	
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@GetMapping
	public List<UserData> getAllUsers(){
		
		//UserData user2=new UserData(1, "Naren", 34);
		log.info("User Data : "+service.getAllUSer());
		return service.getAllUSer();
	}
	
	@PostMapping
	public ResponseEntity<UserData> saveUsers(@RequestBody UserData user) {
		UserData user2=new UserData();
		user2.setName(user.getName());
		user2.setAge(user.getAge());
		log.info("User Data :", user2);
		return new ResponseEntity<UserData>(service.saveUser(user2), HttpStatus.OK);
		
	}
}
