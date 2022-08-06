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

	
	public RaiseComplaint() {
		super();
		
	}


	public RaiseComplaint(int compliantId, String description, User users) {
		super();
		this.compliantId = compliantId;
		this.description = description;
		this.users = users;
	}


	public int getCompliantId() {
		return compliantId;
	}


	public void setCompliantId(int compliantId) {
		this.compliantId = compliantId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public User getUsers() {
		return users;
	}


	public void setUsers(User users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "RaiseCompliant [compliantId=" + compliantId + ", description=" + description + ", users=" + users + "]";
	}
	
	
	

	
}
