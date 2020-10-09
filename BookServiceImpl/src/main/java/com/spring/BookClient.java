package com.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.spring.bean.Book;
import com.spring.impl.BookServiceImpl;
import com.spring.impl.BookServiceImplimentation;

public class BookClient {

	//@Autowired
	//static BookServiceImpl bookServiceClient;
	
	public static void main(String[] args) {

		BookServiceImpl bookServiceClient = new BookServiceImplimentation();
		Book newBook= new Book("AI",150);
		
		List<Book> books =bookServiceClient.getAllBooks();
		
		Iterator<Book> iterator = books.iterator(); 
		  while(iterator.hasNext()) { 
			  Book book= iterator.next();
			  System.out.println(book.toString()); 
		  }
		
		  	Book book=bookServiceClient.getBookById(1);
			System.out.println(book.toString());
			
			
			bookServiceClient.deleteBookById(5);
			System.out.println("Book has been deleted successfully.");
			
			HttpStatus status =bookServiceClient.addBook(newBook);
			System.out.println("Book Added Status :"+ status);
			
	}

}
