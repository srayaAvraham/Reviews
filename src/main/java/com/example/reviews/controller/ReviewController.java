package com.example.reviews.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.example.reviews.exception.ResourceNotFoundException;
import com.example.reviews.model.Review;
import com.example.reviews.service.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	@GetMapping("/api/reviews")
	@CrossOrigin(origins = "*")
	public ResponseEntity<Map<String, Object>> getReview(        
			@RequestParam(required = false) String productId,
			@RequestParam(required = false) String score,
	        @RequestParam(defaultValue = "0") int page,
	        @RequestParam(defaultValue = "3") int size){

		return ResponseEntity.ok().body(reviewService.getReview(productId, score, page, size));
	};
}
