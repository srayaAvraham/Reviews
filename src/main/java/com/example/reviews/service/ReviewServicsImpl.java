package com.example.reviews.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.reviews.model.Review;
import com.example.reviews.repository.ReviewRepository;

@Service
@Transactional
public class ReviewServicsImpl implements ReviewService{

	@Autowired
	private ReviewRepository reviewRepository;
	@Override
	public Review createReview(Review review) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review updateReview(Review review) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getAllReview(int page, int size) {
		List<Review> reviews = new ArrayList<Review>();
		Pageable paging = PageRequest.of(page, size);
		Page<Review> pageTuts = reviewRepository.findAll(paging);
		reviews = pageTuts.getContent();
	    Map<String, Object> response = new HashMap<>();
	    response.put("reviews", reviews);
	    response.put("currentPage", pageTuts.getNumber());
	    response.put("totalItems", pageTuts.getTotalElements());
	    response.put("totalPages", pageTuts.getTotalPages());
		return response;
	}

	@Override
	public Review getReviewById(long reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReview(long id) {
		// TODO Auto-generated method stub
		
	}

}
