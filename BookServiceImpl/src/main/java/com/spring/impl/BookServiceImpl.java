package com.spring.impl;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.spring.bean.Book;

public interface BookServiceImpl {

		List<Book> getAllBooks();
		Book getBookById(int id);
		HttpStatus addBook(Book book);
		void deleteBookById(int id);
		
}
