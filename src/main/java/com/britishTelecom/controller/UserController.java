package com.britishTelecom.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.britishTelecom.entity.UserDetails;
import com.britishTelecom.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/id/{userId}")
	public ResponseEntity<UserDetails> getUserDetailsById(@PathVariable long userId){
		Optional<UserDetails> userOptional = userService.getUserDetailsById(userId);
		
		 return userOptional.map(UserDetails -> new ResponseEntity<>(UserDetails, HttpStatus.OK))
	                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
		
	}
	
	 @PostMapping
	    public ResponseEntity<UserDetails> createUser(@RequestBody UserDetails user) {
	        UserDetails savedUser = userService.saveUser(user);
	        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	    }

}
