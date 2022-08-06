package com.onlinevegetableshopping.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Feedback is the Entity representing feedback table in database
 *
 */

@Entity
@Table(name="feedback")
public class FeedBack {
	
	@Id
	@Column(name = "feedback_id")
	private int feedbackId;
	private String description;
	
	
	/**
	 * feedback default constructor
	 */
	public FeedBack() {
		super();
	}

	

	/**
	 * feedback constructor with fields as parameters
	 * 
	 * @param feedbackId   the feedback Id
	 * @param description  the description given for feedback
	 * @param feedbackDate the date on which feedback was given
	 */
	public FeedBack(int feedbackId, String description) {
		super();
		this.feedbackId = feedbackId;
		this.description = description;
	}

	/**
	 * gets the Feedback Id
	 * 
	 * @return
	 */

	public int getFeedbackId() {
		return feedbackId;
	}

	/**
	 * setters for the feedBack Id
	 * 
	 * @param feedbackId
	 */

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}


	/**
	 * gets the feedback description
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * setters for the feedback description
	 * 
	 * @param description
	 */

	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "FeedBack [feedbackId=" + feedbackId + ", description=" + description + "]";
	}



	



	
	
	
	
	

}
