package com.onlinevegetableshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.model.FeedBack;
import com.onlinevegetableshopping.model.Order;
import com.onlinevegetableshopping.model.RaiseComplaint;
import com.onlinevegetableshopping.model.Vegetable;

@Service
public interface AdminService {
	
	/* 
	 * methods for managing the Admin
	 */
	

	public List<Vegetable> getAllVegtable();
	public Vegetable addVegetables(Vegetable vegetable);
	public Vegetable updateVegetables(Vegetable vegetable);
	public Vegetable deleteVegetables(int id);
	public List<RaiseComplaint> viewComplaints();
	public List<FeedBack> viewFeedbacks();
	public List<Order> viewOrders();
	
	
	

}
