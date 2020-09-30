package com.cg.iter.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddedNewReview {
	
	WebDriver driver;
	
	@Given("^Add new review page shown$")
	public void add_new_review_page_shown() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://localhost:4200/addReview");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}

	@When("^give details of review$")
	public void give_details_of_book() throws Throwable {
		driver.findElement(By.id("reviewId")).sendKeys("12345");
		driver.findElement(By.id("headline")).sendKeys("The war");
		driver.findElement(By.id("rating")).sendKeys("4");		
		driver.findElement(By.id("comment")).sendKeys("Nice book");
		
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	    
	}

	@Then("^user seen the review added successfully in the list$")
	public void user_seen_the_book_added_successfully_in_the_list() throws Throwable {
		System.out.println("Added Successfully");
	   driver.close();
	   
	}

}
