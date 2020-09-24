package com.capgemini.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookstore.entity.Customer;
import com.capgemini.bookstore.service.CustomerServiceImpl;


@RestController
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	private CustomerServiceImpl customerService;

	@PostMapping("/addCustomer")
	private Customer addCustomer(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
		
	}
	
	@GetMapping("/getAllCustomer")
	 private List<Customer> viewAllCustomer(){
        return customerService.viewAllCustomer();
	}
	
	 @GetMapping(value = "/{id}")
	    private Customer viewCustomer(@PathVariable(value = "id")Long custId)
	    {
	    	return customerService.viewCustomer(custId);
	    }
	 
	 @PutMapping(value = "/update")
	    private Customer updateCustomer(@RequestBody Customer userDetailsToUpdate)
	    {
	    	//Customer customer = customerService.viewCustomer(custId);
	    	
	    	return customerService.updateCustomer(userDetailsToUpdate);
	    }
	 
	 @DeleteMapping(value = "/{id}")
	    private void deleteCustomer(@PathVariable(value = "id")Long custId)
	    {
	    	customerService.deleteCustomer(custId);
	    }
}
