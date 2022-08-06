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

	/*
	 * adding the dependent Admin Repository to the Admin Service  
	 * Implementation
	 */
	
	@Autowired
	private VegetableRepository vegRepo;
	
	@Autowired
	private RaiseCompliantRepository raiseRepo;
	
	@Autowired
	private FeedbackRepository feedbackRepo;
	
	@Autowired
	private OrderRepository orderRepo;

	@Override
	public Vegetable addVegetables(Vegetable vegetable) {
		Vegetable veg= vegRepo.saveAndFlush(vegetable);
		return veg;
	}

	@Override
	public Vegetable deleteVegetables(int id) {
		
		 vegRepo.deleteById(id);
		return null;
	}

	@Override
	public Vegetable updateVegetables(Vegetable vegetable) {
		Vegetable Updatedvegetable = vegRepo.saveAndFlush(vegetable);
		return Updatedvegetable;
	}

	@Override
	public List<Vegetable> getAllVegtable() {
		
		return vegRepo.findAll();
	}

	@Override
	public List<RaiseComplaint> viewComplaints() {
		
		return raiseRepo.findAll();
	}

	@Override
	public List<FeedBack> viewFeedbacks() {
		
		return feedbackRepo.findAll();
	}

	@Override
	public List<Order> viewOrders() {
		
		return orderRepo.findAll();
	}

	

	

	
	
	
	
	
	
}
