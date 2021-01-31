package com.example.reviews.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.example.reviews.model.Review;

public interface ReviewService {

	Map<String, Object> getReview(String productId, String score, int page, int size);

}
