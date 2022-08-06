package com.onlinevegetableshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.dao.CartRepository;
import com.onlinevegetableshopping.dao.OrderRepository;
import com.onlinevegetableshopping.model.Order;

@Service
public class CartServiceImpl implements CartService{

	// connecting the service implementation with the Order repository

	@Autowired
	private OrderRepository orderRepo;
	
	// method implementing to make the order

	@Override
	public Order makeOrder(Order order) {
		
		Order makeorder = orderRepo.saveAndFlush(order);
		return order;
	}

}
