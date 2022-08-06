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
    

   

    public Cart() {
		super();
		
	}

public Cart(int cartuserId, int totalBill, String invoice, Vegetable vegetables) {
	super();
	this.cartuserId = cartuserId;
	this.totalBill = totalBill;
	this.invoice = invoice;
	this.vegetables = vegetables;
}

public int getCartuserId() {
	return cartuserId;
}

public void setCartuserId(int cartuserId) {
	this.cartuserId = cartuserId;
}

public int getTotalBill() {
	return totalBill;
}

public void setTotalBill(int totalBill) {
	this.totalBill = totalBill;
}

public String getInvoice() {
	return invoice;
}

public void setInvoice(String invoice) {
	this.invoice = invoice;
}

public Vegetable getVegetables() {
	return vegetables;
}

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
