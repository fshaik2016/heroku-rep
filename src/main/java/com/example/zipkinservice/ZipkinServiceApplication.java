package com.example.zipkinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@SpringBootApplication
public class ZipkinServiceApplication {
	
	@Value("${myuser.name}")
	private String myUserName;

	
	@GetMapping("/hi")
	String hi() {
		return "Hello " + myUserName;
	}
	public static void main(String[] args) {
		SpringApplication.run(ZipkinServiceApplication.class, args);
	}
}
