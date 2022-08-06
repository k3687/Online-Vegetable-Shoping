package com.onlinevegetableshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.dao.CartRepository;
import com.onlinevegetableshopping.dao.FeedbackRepository;
import com.onlinevegetableshopping.dao.RaiseCompliantRepository;
import com.onlinevegetableshopping.dao.UserRepository;
import com.onlinevegetableshopping.dao.VegetableRepository;
import com.onlinevegetableshopping.model.Cart;
import com.onlinevegetableshopping.model.FeedBack;
import com.onlinevegetableshopping.model.RaiseComplaint;
import com.onlinevegetableshopping.model.User;
import com.onlinevegetableshopping.model.Vegetable;

@Service
public class UserServiceImpl implements UserService {

	// connecting the service implementation with the Feedback repository

	@Autowired
	private FeedbackRepository feedbackRepo;
	
	// connecting the service implementation with the Vegetable repository

	@Autowired
	private VegetableRepository vegRepo;
	
	// connecting the service implementation with the Cart repository

	@Autowired
	private CartRepository cartRepo;
	
	// connecting the service implementation with the Raise Compliant repository

	@Autowired
	private RaiseCompliantRepository raiseRepo;

	// method implementing to give feedback

	@Override
	public FeedBack giveFeedBack(FeedBack feedback) {
		
		FeedBack userFeedback = feedbackRepo.saveAndFlush(feedback);
		return userFeedback;
	}

	// method implementing to view all Vegetable

	public List<Vegetable> viewAllVegtable() {
		List<Vegetable> res=vegRepo.findAll();
		return res;
	}

	// method implementing to add vegetable to Cart

	@Override
	public Cart addvegetableToCart(Cart cart) {
		Cart addtocart=cartRepo.saveAndFlush(cart);
		return addtocart;
	}
	
	// method implementing to view Cart

	public List<Cart> viewCart() {
		
		List<Cart> viewCart = cartRepo.findAll();
		return viewCart;
	}
	
	// method implementing to raise Complaint 

	@Override
	public RaiseComplaint raiseCompliant(RaiseComplaint raisecomp) {
		RaiseComplaint raise = raiseRepo.saveAndFlush(raisecomp);
		return raise;
	}
	
	// method implementing to delete Vegetable by Id

	public Cart deleteVegetablebyId(int veg_id) {
		cartRepo.deleteById(veg_id);
		return null;
	}

	

	

	

	

	

	
	

	
	

	
	
	
}
