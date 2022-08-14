package com.onlinevegetableshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Vegetable is the Entity representing Vegetables table in database
 * 
 * @author Khan, Saif
 *
 */
@Entity
@Table(name="vegetable")
public class Vegetable {
	
	@Id
	@Column(name="veg_id")
	private int id;
	@Column(name="veg_name")
	private String name;
	@Column(name="veg_price")
	private int price;
	@Column(name="veg_quantity")
	private int quantity;
		
	/**
	 * Vegetable default constructor
	 */
	
	
	public Vegetable() {
		super();
		
	}

	/**
	 * Vegetable constructor with fields as parameters
	 * 
	 * @param id      the vegetable id
	 * @param nameame      the  name of vegetable
	 * @param price      the price of vegetable
	 * @param quantity   the quantity of vegetable
	 */
	public Vegetable(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	/**
	 * gets the id of vegetable
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	

	

	/**
	 * setters for the id of vegetable
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * gets the name vegetable
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * setters for the user vegetable
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the vegetable price
	 * 
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * setters for the vegetable price
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * gets the vegetable quantity
	 * 
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * setters for the vegetable quantity
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Vegetable [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
	
	
	
	
	
	
	

}
