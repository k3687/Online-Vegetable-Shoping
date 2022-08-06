package com.onlinevegetableshopping.model;

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
 * The Class RaiseComplaint is the Entity representing raisecompliant table in database
 * 
 * @author Team4
 *
 */
@Entity
@Table(name="raisecompliant")
public class RaiseComplaint {
	
	@Id
	@Column(name="complaint_id")
	private int compliantId;
	@Column(name="compliant_description")
	private String description;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(targetEntity = User.class)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "user_Id")
	private User users;

	
	/**
	 * RaiseComplaint default constructor
	 */
	public RaiseComplaint() {
		super();
		
	}

	/**
	 * RaiseComplaint constructor with fields as parameters
	 * 
	 * @param complaintId      the complaint Id
	 * @param description      the  description of complaint
	 * @param users            the complaint of users
	 */

	public RaiseComplaint(int compliantId, String description, User users) {
		super();
		this.compliantId = compliantId;
		this.description = description;
		this.users = users;
	}


	/**
	 * gets the complaint Id
	 * 
	 * @return
	 */
	public int getCompliantId() {
		return compliantId;
	}

	/**
	 * setters for the complaint Id
	 * 
	 * @param complaintId
	 */
	public void setCompliantId(int compliantId) {
		this.compliantId = compliantId;
	}

	/**
	 * gets the Description of complaint
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * setters for the description
	 * 
	 * @param description
	 */

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * gets the users
	 * 
	 * @return
	 */

	public User getUsers() {
		return users;
	}

	/**
	 * setters for the users
	 * 
	 * @param users
	 */

	public void setUsers(User users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "RaiseCompliant [compliantId=" + compliantId + ", description=" + description + ", users=" + users + "]";
	}
	
	
	

	
}
