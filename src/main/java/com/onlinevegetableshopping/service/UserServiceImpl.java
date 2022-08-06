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

	@Autowired
	private FeedbackRepository feedbackRepo;
	
	@Autowired
	private VegetableRepository vegRepo;
	
	@Autowired
	private CartRepository cartRepo;
	
	@Autowired
	private RaiseCompliantRepository raiseRepo;

	@Override
	public FeedBack giveFeedBack(FeedBack feedback) {
		
		FeedBack userFeedback = feedbackRepo.saveAndFlush(feedback);
		return userFeedback;
	}

	public List<Vegetable> viewAllVegtable() {
		List<Vegetable> res=vegRepo.findAll();
		return res;
	}

	@Override
	public Cart addvegetableToCart(Cart cart) {
		Cart addtocart=cartRepo.saveAndFlush(cart);
		return addtocart;
	}

	public List<Cart> viewCart() {
		
		List<Cart> viewCart = cartRepo.findAll();
		return viewCart;
	}

	@Override
	public RaiseComplaint raiseCompliant(RaiseComplaint raisecomp) {
		RaiseComplaint raise = raiseRepo.saveAndFlush(raisecomp);
		return raise;
	}

	public Cart deleteVegetablebyId(int veg_id) {
		cartRepo.deleteById(veg_id);
		return null;
	}

	

	

	

	

	

	
	

	
	

	
	
	
}
