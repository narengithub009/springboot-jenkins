package com.java.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.model.User;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@GetMapping
	public ResponseEntity<User> getAllUsers(){
		
		User user2=new User(1, "Naren", 34);
		return new ResponseEntity<User>(user2, HttpStatus.OK);
	}
	
	public ResponseEntity<User> saveUsers(@RequestBody User user) {
		
		
		return null;
		
		
		
	}
}
