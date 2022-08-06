package com.onlinevegetableshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.dao.RegistrationRepository;
import com.onlinevegetableshopping.dao.UserRepository;
import com.onlinevegetableshopping.model.User;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	// connecting the service implementation with the Registration repository

	@Autowired
	private RegistrationRepository regRepo;
	
	// connecting the service implementation with the User repository

	@Autowired
	private UserRepository useRepo;
	
	// method implementing to add user

	@Override
	public User regUser(User user) {
		User adduser = useRepo.saveAndFlush(user);
		return adduser;
	}
	


}
