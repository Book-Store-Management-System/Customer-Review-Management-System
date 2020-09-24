package com.capgemini.bookstore.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer reviewId;
	
	//@ManyToOne
	//@JoinColumn(name = "title")
	//@OneToOne
	//private Book book;
	
	//@ManyToOne
	//@JoinColumn(name = "firstName")
	@OneToOne
	
	//private Customer customer;
	private int rating;
	private String headline;
	private String comment;
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(Integer reviewId, Book book, Customer customer, int rating, String headline, String comment) {
		super();
		this.reviewId = reviewId;
		//this.book = book;
		//this.customer = customer;
		this.rating = rating;
		this.headline = headline;
		this.comment = comment;
		
	}
	public Integer getReviewId() {
		return reviewId;
	}
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}
	//public Book getBook() {
		//return book;
	//}
	//public void setBook(Book book) {
		//this.book = book;
	//}
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", rating=" + rating + ", headline=" + headline + ", comment=" + comment
				+ "]";
	}
	
	
	
	}
	
	


