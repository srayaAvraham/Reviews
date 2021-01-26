package com.example.reviews.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.example.reviews.model.Review;

public interface ReviewService {
	
	Review createReview(Review review);

	Review updateReview(Review review);

	Map<String, Object> getReview(String productId, String score, int page, int size);

	Review getReviewById(long reviewId);

	void deleteReview(long id);
}
