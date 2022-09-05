package com.onlinevegetableshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.exception.OrderIdNotFoundException;
import com.onlinevegetableshopping.exception.UserIdNotFoundException;
import com.onlinevegetableshopping.exception.VegetableIdNotFoundException;
import com.onlinevegetableshopping.model.FeedBack;
import com.onlinevegetableshopping.model.Order;
import com.onlinevegetableshopping.model.RaiseComplaint;
import com.onlinevegetableshopping.model.User;
import com.onlinevegetableshopping.model.Vegetable;

@Service
public interface AdminService {
	
	/* 
	 * methods for managing the Admin
	 */
	

	public List<Vegetable> getAllVegtable();
	public Vegetable addVegetables(Vegetable vegetable);
	public Vegetable updateVegetables(Vegetable vegetable);
	public Vegetable deleteVegetables(int id) throws VegetableIdNotFoundException;
	public List<RaiseComplaint> viewComplaints();
	public List<FeedBack> viewFeedbacks();
	public List<Order> viewOrders();
	public Vegetable getById(int id) throws VegetableIdNotFoundException;
	public Order getOrderById(int orderId) throws OrderIdNotFoundException;
	public User viewUserById(int id) throws UserIdNotFoundException;
	
	

}
