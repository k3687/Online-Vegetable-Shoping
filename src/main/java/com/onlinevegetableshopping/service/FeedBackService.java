package com.onlinevegetableshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinevegetableshopping.model.FeedBack;

@Service
public interface FeedBackService {
	//method for managing feedbacks given by the Instructor
			public List<FeedBack> getAllFeedbacks();
			public List<FeedBack> deleteFeedback(Integer feedbackId);
			public List<FeedBack> saveFeedback(FeedBack feedback);
			public List<FeedBack> updateFeedback(FeedBack feedback);

}
