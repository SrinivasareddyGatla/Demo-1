package com.example.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.user.UserModel;
import com.example.respository.UserRepository;
import com.example.service.user.UserService;


public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserModel getUserById(final Long id) {
		return userRepo.getUserById(id);
	}

	@Override
	public UserModel getUserByEmail(final String email) {
		return null;
	}

	@Override
	public void doSomething() {
		
	}
}
