package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserService;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users/rep/{id}")
	public Optional<UserEntity> getAllUsers(@PathVariable int id) {
		return userRepository.findById(id);
	}
	
	@PostMapping("/users/register")
	public void createUser(@RequestBody UserEntity user) {
		userService.create(user);
	}
	@GetMapping("/users")
	public List<UserEntity> getUsers(){
		return userService.getAll();
	}
}
