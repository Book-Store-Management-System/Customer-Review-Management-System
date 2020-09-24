package com.capgemini.bookstore.entity;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book 
{
	//@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	@Id
	private String title;
	private String author;
	private String description;
	private String isbn;
	private float price;
//	private byte[] image;
//	private Date publishDate;
//	public Book() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Book(int bookId, String title, String author, String description, String isbn, float price, byte[] image,
//			Date publishDate) {
//		super();
//		this.bookId = bookId;
//		this.title = title;
//		this.author = author;
//		this.description = description;
//		this.isbn = isbn;
//		this.price = price;
//		this.image = image;
//		this.publishDate = publishDate;
//	}
//	@Override
//	public String toString() {
//		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description
//				+ ", isbn=" + isbn + ", price=" + price + ", image=" + Arrays.toString(image) + ", publishDate="
//				+ publishDate + "]";
//	}
//	public int getBookId() {
//		return bookId;
//	}
//	public void setBookId(int bookId) {
//		this.bookId = bookId;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public String getIsbn() {
//		return isbn;
//	}
//	public void setIsbn(String isbn) {
//		this.isbn = isbn;
//	}
//	public float getPrice() {
//		return price;
//	}
//	public void setPrice(float price) {
//		this.price = price;
//	}
//	public byte[] getImage() {
//		return image;
//	}
//	public void setImage(byte[] image) {
//		this.image = image;
//	}
//	public Date getPublishDate() {
//		return publishDate;
//	}
//	public void setPublishDate(Date publishDate) {
//		this.publishDate = publishDate;
//	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
public Book(int bookId, String title, String author, String description, String isbn, float price) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.author = author;
	this.description = description;
	this.isbn = isbn;
	this.price = price;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description
			+ ", isbn=" + isbn + ", price=" + price + "]";
}
	
	

}
