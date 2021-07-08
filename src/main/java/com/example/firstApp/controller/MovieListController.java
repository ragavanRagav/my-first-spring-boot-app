package com.example.firstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/c2")
public class MovieListController {
	
	@GetMapping("/hi")
	public String hi(@RequestParam(value = "q" , defaultValue = "text") String anString) {
		return "Hii from seperate controller : "+anString;
	}
	
}
