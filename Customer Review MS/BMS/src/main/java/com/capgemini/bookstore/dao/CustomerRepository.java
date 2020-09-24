package com.capgemini.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bookstore.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
	
	Customer save(Customer customer);
}
