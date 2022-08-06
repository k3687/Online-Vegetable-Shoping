package com.onlinevegetableshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.dao.CartRepository;
import com.onlinevegetableshopping.dao.OrderRepository;
import com.onlinevegetableshopping.model.Order;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private OrderRepository orderRepo;
	
	@Override
	public Order makeOrder(Order order) {
		
		Order makeorder = orderRepo.saveAndFlush(order);
		return order;
	}

}
