package com.onlinevegetableshopping.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinevegetableshopping.model.FeedBack;
import com.onlinevegetableshopping.model.Order;
import com.onlinevegetableshopping.model.RaiseComplaint;
import com.onlinevegetableshopping.model.Vegetable;
import com.onlinevegetableshopping.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adServe;
	
	/*
	 *  Controller for the requests related to the Vegetable store
	 */	
	
	//requests the controller to add vegetable in vegetable store
	
	//http://localhost:8091/onlinevegetableshopping/admin/addveg
	
	@PostMapping("/addveg")  
	public ResponseEntity<Vegetable> addveg(@RequestBody Vegetable vegetable)
	{
	adServe.addVegetables(vegetable);
		return new ResponseEntity("vegetable added",HttpStatus.OK);
		
	}
	
	//requests the controller to delete by vegetable id in vegetable store

	//http://localhost:8091/onlinevegetableshopping/admin/deleteById/

	@DeleteMapping("/deleteById/{id}") 	
	public ResponseEntity<Vegetable> deleteVegById(@PathVariable("id") Integer id)
	{
		adServe.deleteVegetables(id);
		return new ResponseEntity("Vegetable Deleted",HttpStatus.OK);
		
	}
	
	//requests the controller to update vegetable in vegetable store

	//http://localhost:8091/onlinevegetableshopping/admin/update/
	
	@PutMapping("/update") 
	public ResponseEntity<Vegetable> updateVegetable(@RequestBody Vegetable vegetable)
	{
		Vegetable updateveg = adServe.updateVegetables(vegetable);
		
		return new ResponseEntity("Vegetable updated successfully",HttpStatus.OK);
		
	}
	
	//requests the controller to get all vegetable from vegetable store

	//http://localhost:8091/onlinevegetableshopping/admin/allveg
	
	@GetMapping("/allveg") 
	public ResponseEntity<List<Vegetable>> getAllVegetable()
	{
		List<Vegetable> vegList = adServe.getAllVegtable();
		if (vegList.isEmpty()) {
			return new ResponseEntity("Sorry no vegetable list found!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Vegetable>>(vegList,HttpStatus.OK);
		
	}
	
	/*
	 *  Controller for the requests related to the Raise Complaint
	 */
	
	//requests the controller to view all complaint raised by user

	//http://localhost:8091/onlinevegetableshopping/admin/viewallraise
	
	@GetMapping("/viewallraise")
	public ResponseEntity<List<RaiseComplaint>> viewCompliant()
	{
		List<RaiseComplaint> raisecomp = adServe.viewComplaints();
		return new ResponseEntity<List<RaiseComplaint>>(raisecomp, HttpStatus.OK);
		
	}
	
	/*
	 *  Controller for the requests related to the feedback
	 */
	//requests the controller to view all feedback given by user
	
	//http://localhost:8091/onlinevegetableshopping/admin/viewfeedback
	
	@GetMapping("/viewfeedback")
	public ResponseEntity<List<FeedBack>> viewFeedback()
	{
		List<FeedBack> viewfeedback = adServe.viewFeedbacks();
		return new ResponseEntity(viewfeedback, HttpStatus.OK);
		
	}
	
	/*
	 *  Controller for the requests related to the Order
	 */
	//requests the controller to view all order by user

	//http://localhost:8091/onlinevegetableshopping/admin/vieworder
	@GetMapping("/vieworder")
	public ResponseEntity<List<Order>> viewOrders()
	{
		List<Order> viewOrder = adServe.viewOrders();
		return new ResponseEntity(viewOrder,HttpStatus.OK);
		
	}
	
	
	
	
	
	

	
	

}
