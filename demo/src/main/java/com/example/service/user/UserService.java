package com.example.service.user;

import org.springframework.stereotype.Service;

import com.example.model.user.UserModel;

@Service
public interface UserService {

	public UserModel getUserById(final Long id);
	
	public UserModel getUserByEmail(final String email);
	
	public void doSomething();
}
