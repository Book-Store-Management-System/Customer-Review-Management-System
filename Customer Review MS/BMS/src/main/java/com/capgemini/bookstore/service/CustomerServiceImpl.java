package com.capgemini.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookstore.dao.CustomerRepository;
import com.capgemini.bookstore.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> viewAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public Customer viewCustomer(Long custId) {
		if(customerRepository.findById(custId).isPresent())
            return customerRepository.findById(custId).get();
        return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		 if(customerRepository.findById(customer.getCustId()).isPresent()){
	            Customer tempCustomer = customerRepository.findById(customer.getCustId()).get();
	            tempCustomer.setEmail(customer.getEmail());
	            tempCustomer.setCustPhone(customer.getCustPhone());
	            tempCustomer.setAddress(customer.getAddress());
	            tempCustomer.setZipCode(customer.getZipCode());
	            tempCustomer.setCountry(customer.getCountry());
	            customerRepository.save(tempCustomer);
	            return tempCustomer;
	        }
	        return null;
	}

	@Override
	public void deleteCustomer(Long custId) {
		if(customerRepository.findById(custId).isPresent()){
            customerRepository.deleteById(custId);
        }
		
	}

}
