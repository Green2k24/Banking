package com.green.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.green.model.User;

@RestController
public class UserController {
	
	
	@PostMapping("/registerUser")
	public String registerUser(@RequestBody User user) {	
		return "register successfully";
	}
	
	@PostMapping("/login")
	public String login() {
		return "success";
	}
	
	@PostMapping("/withdraw")
	public String withdraw(){
		return "withdraw";
	}
	
	@PostMapping("/deposit")
	public String deposit(){
		return "deposit";
	}
	
	@GetMapping("/history")
	public String history(){
		return "withdraw";
	}
	
	@GetMapping("/logout")
	public String logout(){
		return "logout";
	}
}
