package com.java.demo.controller;

import java.util.Date;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/date")
	public String showCurrentDate() {
		log.info("Date : {}", new Date().toString());
		
		return new Date().toString();
	}
	
	@GetMapping("{name}")
	public String getMessage(@PathVariable("name") String empName) {
		log.info("Hello "+empName+" Welecome"+new Random().nextInt());
		return "Hello "+empName+" Welecome";
	}
}
