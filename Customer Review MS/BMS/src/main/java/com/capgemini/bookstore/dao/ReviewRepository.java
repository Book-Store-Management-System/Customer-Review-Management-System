package com.capgemini.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bookstore.entity.Customer;
import com.capgemini.bookstore.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{
	
	
}
