package com.onlinevegetableshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.dao.AdminRepository;
import com.onlinevegetableshopping.dao.FeedbackRepository;
import com.onlinevegetableshopping.dao.OrderRepository;
import com.onlinevegetableshopping.dao.RaiseCompliantRepository;
import com.onlinevegetableshopping.dao.VegetableRepository;
import com.onlinevegetableshopping.model.FeedBack;
import com.onlinevegetableshopping.model.Order;
import com.onlinevegetableshopping.model.RaiseComplaint;
import com.onlinevegetableshopping.model.Vegetable;

@Service
public class AdminServiceImpl implements AdminService{

	

	// connecting the service implementation with the Vegetable repository
	
	@Autowired
	private VegetableRepository vegRepo;
	
	// connecting the service implementation with the RaiseCompliant repository

	@Autowired
	private RaiseCompliantRepository raiseRepo;
	
	// connecting the service implementation with the Feedback repository

	@Autowired
	private FeedbackRepository feedbackRepo;
	
	// connecting the service implementation with the Order repository

	@Autowired
	private OrderRepository orderRepo;

	// method implementing to add Vegetable in Vegetable Store

	@Override
	public Vegetable addVegetables(Vegetable vegetable) {
		Vegetable veg= vegRepo.saveAndFlush(vegetable);
		return veg;
	}
	// method implementing to delete Vegetable in Vegetable Store

	@Override
	public Vegetable deleteVegetables(int id) {
		
		 vegRepo.deleteById(id);
		return null;
	}
	
	// method implementing to update Vegetable in Vegetable Store

	@Override
	public Vegetable updateVegetables(Vegetable vegetable) {
		Vegetable Updatedvegetable = vegRepo.saveAndFlush(vegetable);
		return Updatedvegetable;
	}

	// method implementing to get all Vegetable form Vegetable Store

	@Override
	public List<Vegetable> getAllVegtable() {
		
		return vegRepo.findAll();
	}
	
	// method implementing to view all Complaint raised by user

	@Override
	public List<RaiseComplaint> viewComplaints() {
		
		return raiseRepo.findAll();
	}
	
	// method implementing to view all FeedBack given by user

	@Override
	public List<FeedBack> viewFeedbacks() {
		
		return feedbackRepo.findAll();
	}
	
	// method implementing to view all Order details which are ordered by user

	@Override
	public List<Order> viewOrders() {
		
		return orderRepo.findAll();
	}

	

	

	
	
	
	
	
	
}
