package com.capgemini.bookstore.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bookstore.entity.Book;
import com.capgemini.bookstore.entity.Customer;

public interface BookRepository extends JpaRepository<Book, Long>{

	Book save(Book book);
}
