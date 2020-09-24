package com.capgemini.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookstore.entity.Review;
import com.capgemini.bookstore.service.ReviewServiceImpl;
@RequestMapping("/Review")
@RestController
public class ReviewController {
	
	@Autowired
	private ReviewServiceImpl reviewService;
	
	@PostMapping("/addReview")
	private Review addReview(@RequestBody Review reviews)
	{
		return reviewService.addReview(reviews);
		
	}
	
	@GetMapping("/getAllReview")
	 private List<Review> viewAllReview(){
       return reviewService.viewAllReview();
	}
	
	 @GetMapping(value = "/{id}")
	    private Review viewReview(@PathVariable(value = "id")Integer reviewId)
	    {
	    	return reviewService.viewReview(reviewId);
	    }
	 
	
	 @DeleteMapping(value = "/{id}")
	    private void deleteReview(@PathVariable(value = "id")Integer reviewId)
	    {
		 reviewService.deleteReview(reviewId);
	    }

}
