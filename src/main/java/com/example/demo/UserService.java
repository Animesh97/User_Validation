package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;	
	
	public void create(UserEntity user) {
		userRepository.save(user);
	}
	
	public List<UserEntity> getAll(){		
		return userRepository.findAll();
	}
}
