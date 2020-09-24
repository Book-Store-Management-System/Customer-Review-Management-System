package com.capgemini.bookstore.service;

import java.util.List;

import com.capgemini.bookstore.entity.Review;

public interface ReviewService {
    public Review addReview(Review reviews);
	
	public List<Review> viewAllReview();
	
	public Review viewReview(Integer reviewId);
	
	public String updateReview(Integer reviewId, String headline,String comment);

	public void deleteReview(Integer reviewId);

}
