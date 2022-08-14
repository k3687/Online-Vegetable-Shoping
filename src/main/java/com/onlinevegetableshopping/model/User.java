package com.onlinevegetableshopping.model;

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


/**
 * The Class User is the Entity representing User table in database
 * 
 * @author Das,  Smrutiranjan
 *
 */
@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@Column(name="user_Id")
	private int id;
	@Column(name="user_Name")
	private String name;
	@Column(name="user_Password")
	private String password;
	
	@OneToMany(targetEntity = RaiseComplaint.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "complaint_id")
	private Set<RaiseComplaint> raiseComplaints;
	
	@OneToMany(targetEntity = FeedBack.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "feedback_id")
	private Set<FeedBack> feedback;
	
	@ManyToOne(targetEntity = Order.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "order_id")
	private Order orders;
	
	
	
	

	/**
	 * User default constructor
	 */
	public User() {
		super();
		
	}

	/**
	 * User constructor with fields as parameters
	 * 
	 * @param Id        the Id of user
	 * @param name      the name of user
	 * @param password   the password of user
	 * @param orders      the orders by user
	 */
	
	public User(int id, String name, String password, Set<RaiseComplaint> raiseComplaints, Set<FeedBack> feedback,
			Order orders) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.raiseComplaints = raiseComplaints;
		this.feedback = feedback;
		this.orders = orders;
	}
//	public User(int id, String name, String password) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.password = password;
//	}
	
	/**
	 * gets the Id of user
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	

	/**
	 * setters for the Id of user 
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * gets the name user
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * setters for the user name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the user password
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * setters for the user password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	

	public Set<RaiseComplaint> getRaiseComplaints() {
		return raiseComplaints;
	}

	public void setRaiseComplaints(Set<RaiseComplaint> raiseComplaints) {
		this.raiseComplaints = raiseComplaints;
	}

	public Set<FeedBack> getFeedback() {
		return feedback;
	}

	public void setFeedback(Set<FeedBack> feedback) {
		this.feedback = feedback;
	}
	
	
	

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", raiseComplaints=" + raiseComplaints
				+ ", feedback=" + feedback + ", orders=" + orders + "]";
	}

	

	
	

	
}
