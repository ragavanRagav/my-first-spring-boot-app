package com.example.firstApp;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/c1")
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		
		System.out.println("Server is listening on http://localhost:8081");
	}
	
	@GetMapping("/")
	public ResponseEntity<Object>  hello(@RequestParam(value = "name", defaultValue = "Ragavan") String name) {
		
	    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
	            "key-1", "value-1",
	            "key-2", "value-2",
	            "key-3", "value-3"));
	}

}
