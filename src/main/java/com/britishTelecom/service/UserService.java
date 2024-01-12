package com.britishTelecom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.britishTelecom.entity.UserDetails;
import com.britishTelecom.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public Optional<UserDetails> getUserDetailsById(Long userId){
		return userRepository.findById(userId);
	}

	public UserDetails saveUser(UserDetails user) {
		return userRepository.save(user);
	}
	
	
}
