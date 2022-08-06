package com.onlinevegetableshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.dao.RegistrationRepository;
import com.onlinevegetableshopping.dao.UserRepository;
import com.onlinevegetableshopping.model.User;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private RegistrationRepository regRepo;
	
	@Autowired
	private UserRepository useRepo;

	@Override
	public User regUser(User user) {
		User adduser = useRepo.saveAndFlush(user);
		return adduser;
	}
	


}
