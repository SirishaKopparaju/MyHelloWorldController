package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloWorldController {
	@RequestMapping(value= {"","/","/home"})
	public String sayHello() {
		return "Hello from bridgelaz!!!!!";
	}
	@PostMapping("/post")
	public String sayPosting(@RequestParam String firstName, @RequestParam String lastName){
		return "Hello "+firstName+"!"+lastName+"!";
	}
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello"+name+"!";
	}
	@PutMapping("/put/{firstName}")
	public String sayHelloPut(@PathVariable String firstName,@RequestParam(value="lastName")String lastName) {
		return "Hello" +firstName+" "+lastName+"!";
		
	}
}
