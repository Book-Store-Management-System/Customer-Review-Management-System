package com.capgemini.bookstore.service;

import java.util.List;

import com.capgemini.bookstore.entity.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public List<Customer> viewAllCustomer();
	
	public Customer viewCustomer(Long custId);
	
	public Customer updateCustomer(Customer customer) ;

	public void deleteCustomer(Long custId);
	


}
