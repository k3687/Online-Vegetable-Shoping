package com.onlinevegetableshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinevegetableshopping.model.RaiseComplaint;
import com.onlinevegetableshopping.model.Vegetable;
import com.onlinevegetableshopping.service.CustomerSupportService;

@RestController
@RequestMapping("/customersupport")
public class CustomerSupportController {
	
	@Autowired
	private CustomerSupportService customerserve;
	
	//http://localhost:8091/onlinevegetableshopping/customersupport/viewallraisecomplaints
	
	@GetMapping("/viewallraisecomplaints")
	public ResponseEntity<List<RaiseComplaint>> viewcompliants()
	{
		List<RaiseComplaint> viewcompliant = customerserve.viewComplaints();
		return new ResponseEntity<List<RaiseComplaint>>(viewcompliant, HttpStatus.OK);
		
	}
	
	//http://localhost:8091/onlinevegetableshopping/customersupport/solveraisecomplaints/

	@GetMapping("/solveraisecomplaints/{compliantId}")
	public ResponseEntity<RaiseComplaint> fixcomplaintById(@PathVariable("compliantId") Integer compliantId)
	{
		customerserve.solveCompaints(compliantId);
		return new ResponseEntity("Complaint is resloved, Thank you", HttpStatus.OK) ;
		
	}
	
	
	
	
	

}
