package com.java.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);
	
	@PostConstruct
	public void getMessage() {
		log.info("Appliction running....");
	}
	public static void main(String[] args) {
		log.info("Springboot Application running successfully successfully.....Thank you..Thank you!!");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
