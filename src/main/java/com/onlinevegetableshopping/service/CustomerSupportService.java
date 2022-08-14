package com.onlinevegetableshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.model.CustomerSupport;
import com.onlinevegetableshopping.model.RaiseComplaint;

@Service
public interface CustomerSupportService {
	
	public List<RaiseComplaint> viewComplaints();
	
}
