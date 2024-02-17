package com.gowtham.springbootawsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsDemoApplication {

	@GetMapping("/")
	public String home(){
		return "Welcome to Spring Boot AWS!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsDemoApplication.class, args);
	}

}
