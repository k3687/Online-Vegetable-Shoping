package com.onlinevegetableshopping.service;

import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.model.User;

@Service
public interface RegistrationService {
	
	public User regUser(User user);

}
