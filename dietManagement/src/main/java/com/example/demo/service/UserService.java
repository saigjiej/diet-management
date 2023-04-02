package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<User> findByUserId(String userId) {
		return userRepository.findByUserId(userId);
	}

	public void joinUser(User user) {
		userRepository.save(user);
		
	}

	public List<User> findByUserIdAndPassword(String userId, String password) {
		return userRepository.findByUserIdAndPassword(userId, password);
	}

}
