package com.example.reviews.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reviews.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

	  Page<Review> findAll(Pageable pageable);
}
