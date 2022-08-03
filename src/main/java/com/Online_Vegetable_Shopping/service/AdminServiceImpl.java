package com.Online_Vegetable_Shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Online_Vegetable_Shopping.dao.AdminRepository;


public class AdminServiceImpl implements AdminService{

	/*
	 * adding the dependent Admin Repository to the Admin Service  
	 * Implementation
	 */
	
	@Autowired
	private AdminRepository adRepo;
	
	@Override
	public List<User> getAllUsers() {
		
		return null;
	}

	@Override
	public List<User> getAllOrders() {
		
		return null;
	}

	@Override
	public List<VegetableList> addVegetables() {
		
		return null;
	}

	@Override
	public List<VegetableList> updateVegetables() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VegetableList> deleteVegetables() {
		
		return null;
	}

	@Override
	public List<RaisedComplaints> viewComplaints() {
		
		return null;
	}

	@Override
	public Lis<Feedback> getFeedbackByUser() {
		
		return null;
	}

}
