package com.example.reviews.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reviews.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

	  Page<Review> findByScore(String score, Pageable pageable);
	  Page<Review> findByProductIdContaining(String productId, Pageable pageable);
	  Page<Review> findByScoreAndProductIdContaining(String score, String productId, Pageable pageable);
}
