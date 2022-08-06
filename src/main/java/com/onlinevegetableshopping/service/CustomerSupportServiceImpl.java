package com.onlinevegetableshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.dao.RaiseCompliantRepository;
import com.onlinevegetableshopping.model.RaiseComplaint;

@Service
public class CustomerSupportServiceImpl implements CustomerSupportService {

	// connecting the service implementation with the RaiseCompliant repository

	@Autowired
	private RaiseCompliantRepository raiseRepo;
	
	
	// method implementing to view all complaints

	@Override
	public List<RaiseComplaint> viewComplaints() {
		
		return raiseRepo.findAll();
	}
	
	// method implementing to solve all complaints

	@Override
	public RaiseComplaint solveCompaints(int compliantId) {

		RaiseComplaint solve = raiseRepo.getById(compliantId);
		return solve;
	}

}
