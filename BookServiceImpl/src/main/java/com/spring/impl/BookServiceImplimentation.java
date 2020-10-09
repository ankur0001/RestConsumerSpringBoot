package com.spring.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import com.spring.bean.Book;

@Component
public class BookServiceImplimentation implements BookServiceImpl{

	private static final String serviceURL = "http://localhost:8080/v1/books/";
	
	
	//@Autowired
	//private RestTemplate restTemplate;
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	public List<Book> getAllBooks() {
          ResponseEntity<Book[]> response= restTemplate.getForEntity(serviceURL,Book[].class);
		  return Arrays.asList(response.getBody());
	}

	public Book getBookById(int id) {
		ResponseEntity<Book> response= restTemplate.getForEntity(serviceURL+ "/"+id,Book.class);
		return response.getBody();
	}
	
	public HttpStatus addBook(Book book) {
		ResponseEntity<HttpStatus> response = restTemplate.postForEntity(serviceURL, book, HttpStatus.class);
		return response.getStatusCode();
	}
	
	public void deleteBookById(int id) {
		restTemplate.delete(serviceURL+"/" + id);
	}


}
