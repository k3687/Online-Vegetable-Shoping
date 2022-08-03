package com.onlinevegetableshopping.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_vegetable_shopping.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adServ;
	
	public ResponseEntity<List<User>> getAllUserlist()
	{
		System.out.println("All user");
	}
	
	

}
