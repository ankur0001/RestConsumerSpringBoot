package com.spring.bean;



public class Book {
	
	private int id;
	private String category;
	private int price;
	
	
	
	public Book() {
		super();
	}
	
	public Book(String category, int price) {
		super();
		this.category = category;
		this.price = price;
	}

	public Book(int id, String category, int price) {
		super();
		this.id = id;
		this.category = category;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", category=" + category + ", price=" + price + "]";
	}
	
	
}
