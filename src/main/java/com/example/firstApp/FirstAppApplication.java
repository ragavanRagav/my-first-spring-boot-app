package com.example.firstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		
		System.out.println("Server is listening on http://localhost:8081");
	}
	
	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "Ragavan") String name) {
		return "welcome "+name;
	}

}
