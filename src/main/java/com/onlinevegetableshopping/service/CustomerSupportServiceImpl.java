package com.onlinevegetableshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.dao.RaiseComplaintRepository;
import com.onlinevegetableshopping.model.CustomerSupport;
import com.onlinevegetableshopping.model.RaiseComplaint;

@Service
public class CustomerSupportServiceImpl implements CustomerSupportService {

	// connecting the service implementation with the RaiseCompliant repository

	@Autowired
	private RaiseComplaintRepository raiseRepo;
	
	
	// method implementing to view all complaints

	@Override
	public List<RaiseComplaint> viewComplaints() {
		
		return raiseRepo.findAll();
	}
	


	

	

}
