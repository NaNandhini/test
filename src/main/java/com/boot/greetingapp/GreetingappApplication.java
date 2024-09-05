package com.boot.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GreetingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingappApplication.class, args);
	}

	@GetMapping("/details")
	public String details() {
		return "this is chennai";
	}
	@GetMapping("/state")
	public String tamilnadu() {
		return "tamilnadu";
	}
	@GetMapping("/place")
	public String place() {
		return "guindy";
	}

}
