package com.onlinevegetableshopping.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Repository;

import com.onlinevegetableshopping.OnlineVegetableShoppingApplication;
import com.onlinevegetableshopping.dao.CartRepository;
import com.onlinevegetableshopping.dao.FeedbackRepository;
import com.onlinevegetableshopping.dao.OrderRepository;
import com.onlinevegetableshopping.dao.RaiseComplaintRepository;
import com.onlinevegetableshopping.dao.RegistrationRepository;
import com.onlinevegetableshopping.dao.UserRepository;
import com.onlinevegetableshopping.dao.VegetableRepository;
import com.onlinevegetableshopping.model.Cart;
import com.onlinevegetableshopping.model.FeedBack;
import com.onlinevegetableshopping.model.Order;
import com.onlinevegetableshopping.model.RaiseComplaint;
import com.onlinevegetableshopping.model.User;
import com.onlinevegetableshopping.model.Vegetable;
import com.onlinevegetableshopping.service.AdminService;
import com.onlinevegetableshopping.service.CustomerSupportService;
import com.onlinevegetableshopping.service.RegistrationServiceImpl;
import com.onlinevegetableshopping.service.UserService;



@SpringBootTest(classes=OnlineVegetableShoppingApplication.class)
class OnlineVegetableShoppingApplicationTests {

	@Autowired
	private CustomerSupportService custServe;
	
	@Autowired
	private AdminService adminServe;
	
	@Autowired
	private UserService userServe;
	
	@MockBean
	private VegetableRepository vegRepo;
	
	
	
	@MockBean
	private FeedbackRepository feedbackRepo;
	
	@MockBean
	private RaiseComplaintRepository complainRepo;
	
	@MockBean
	private UserRepository userRepo;
	
	@MockBean
	private CartRepository cartRepo;
	
	@MockBean
	private OrderRepository orderRepo;
	
	
	
	/*
	 * Test cases for Admin
	 */
	
	@Test
	public void getVegetableTest()
	{
		when(vegRepo.findAll())
		.thenReturn(Stream.of(new Vegetable(10,"Fruit",10,1)).collect(Collectors.toList()));
		assertEquals(1, adminServe.getAllVegtable().size());
	}
	
	
	@Test
	public void testViewFeedback() {
		when(feedbackRepo.findAll())
		.thenReturn(Stream.of(new FeedBack(101,"Good")).collect(Collectors.toList()));
		assertEquals(1, adminServe.viewFeedbacks().size());
	}
	
	
	@Test
	public void testDeleteVegetables() {
		int id = 112;
		adminServe.deleteVegetables(112);
		verify(vegRepo, times(1)).deleteById(112);
	}
	
	
	@Test
	public void testViewCompliant() {
		
		User user = new User();
		when(complainRepo.findAll())
		.thenReturn(Stream.of(new RaiseComplaint(101,"Bad stuff",user)).collect(Collectors.toList()));
		assertEquals(1, adminServe.viewComplaints().size());
	}
	
	
	@Test
	public void testViewOrder() {
		
		Cart cart = new Cart();
		
		when(orderRepo.findAll()).thenReturn(Stream.of(new Order(1211, "Pending", "Success", cart)).collect(Collectors.toList()));
		assertEquals(1, adminServe.viewOrders().size());
	}
	
	
	/*
     * Test Cases for User
     */

    @Test
    public void testViewAllVegtable() {
        when(vegRepo.findAll()).thenReturn(Stream.of(new Vegetable(111, "Pumkin", 15, 1)).collect(Collectors.toList()));
        assertEquals(1, userServe.viewAllVegtable().size());
    }

    @Test
    public void testViewCart() {
        Vegetable veg = new Vegetable(112, "Cucumber", 10, 2);
        when(cartRepo.findAll()).thenReturn(Stream.of(new Cart(11, 10, "R234", veg)).collect(Collectors.toList()));
        assertEquals(1, userServe.viewCart().size());
    }
    
    /*
     * Test for CustomerSupportService
     */

    @Test
    public void testViewComplaints() {
        User user = new User(12, "Vishesh", "V@234");
        when(complainRepo.findAll()).thenReturn(Stream.of(new RaiseComplaint(11, "Bad", user)).collect(Collectors.toList()));
        assertEquals(1, custServe.viewComplaints().size());
    }

    @Test
    public void testSolveCompaints() {
        User user = new User();
        when(complainRepo.findById(12)).thenReturn(Stream.of(new RaiseComplaint(11, "Bad", user)).collect(Collectors.toList()));
        assertEquals(1, custServe.solveCompaints(12));
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

}
