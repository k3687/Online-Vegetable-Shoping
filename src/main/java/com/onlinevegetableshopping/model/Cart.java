package com.onlinevegetableshopping.model;

import java.io.Serializable;
import java.util.Set;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Cart is the Entity representing Cart table in database
 * 
 * @author Team4
 *
 */

@Entity
@Table(name="cart_details")
public class Cart implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cartuser_id")
	private int cartuserId;
	@Column(name="total_bill")
	private int totalBill;
	@Column(name="invoice")
	private String invoice;
	
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(targetEntity = Vegetable.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "veg_id")
	private Vegetable vegetables;
    

    /**
	 * Cart default constructor
	 */

    public Cart() {
		super();
		
	}
    
	/**
	 * Cart constructor with fields as parameters
	 * 
	 * @param cartuserId      the cart Id
	 * @param totalBill      the  total bill of cart
	 * @param invoice     the invoice of cart
	 * @param vegetables   the vegetables of cart
	 */

public Cart(int cartuserId, int totalBill, String invoice, Vegetable vegetables) {
	super();
	this.cartuserId = cartuserId;
	this.totalBill = totalBill;
	this.invoice = invoice;
	this.vegetables = vegetables;
}

/**
 * gets the Cart Id
 * 
 * @return
 */

public int getCartuserId() {
	return cartuserId;
}

/**
 * setters for the Cart Id
 * 
 * @param cartuserId
 */
public void setCartuserId(int cartuserId) {
	this.cartuserId = cartuserId;
}

/**
 * gets the cart totalbill
 * 
 * @return
 */
public int getTotalBill() {
	return totalBill;
}

/**
 * setters for the cart totalbill
 * 
 * @param totalBill
 */
public void setTotalBill(int totalBill) {
	this.totalBill = totalBill;
}

/**
 * gets the cart invoice
 * 
 * @return
 */

public String getInvoice() {
	return invoice;
}

/**
 * setters for the cart invoice
 * 
 * @param invoice
 */

public void setInvoice(String invoice) {
	this.invoice = invoice;
}

/**
 * gets the cart vegetables
 * 
 * @return
 */
public Vegetable getVegetables() {
	return vegetables;
}

/**
 * setters for the cart vegetables
 * 
 * @param vegetables
 */
public void setVegetables(Vegetable vegetables) {
	this.vegetables = vegetables;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}


@Override
public String toString() {
	return "Cart [cartuserId=" + cartuserId + ", totalBill=" + totalBill + ", invoice=" + invoice + ", vegetables="
			+ vegetables + "]";
}
    



	
	

}
