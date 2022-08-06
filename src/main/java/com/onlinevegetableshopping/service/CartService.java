package com.onlinevegetableshopping.service;

import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.model.Order;

@Service
public interface CartService {
	
	public Order makeOrder(Order order);

}
