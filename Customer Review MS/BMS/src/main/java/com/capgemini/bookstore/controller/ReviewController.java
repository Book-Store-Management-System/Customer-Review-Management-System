package com.capgemini.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.capgemini.bookstore.entity.Customer;
import com.capgemini.bookstore.entity.Review;
import com.capgemini.bookstore.service.ReviewServiceImpl;
@RequestMapping("/Review")
@RestController
@CrossOrigin(origins = "http://localhost:4200")

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
	
	 @GetMapping("/viewReview/{id}")
	    private Review viewReview(@PathVariable(value = "id")Integer reviewId)
	    {
	    	return reviewService.viewReview(reviewId);
	    }
	 
	 @PutMapping("/updateReview/{pid}")
		public ResponseEntity<Review> updateReviewByReviewId(@RequestBody Review reviews)
		{
			reviewService.updateReview(reviews);
			return new ResponseEntity<Review>(reviews, HttpStatus.OK);
		}

	 
	
	 @DeleteMapping("deleteReview/{id}")
	    private void deleteReview(@PathVariable(value = "id")Integer reviewId)
	    {
		 reviewService.deleteReview(reviewId);
	    }

}
