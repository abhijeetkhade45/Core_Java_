package com.company.bookprintingsystem.blc;

public class Book {
	
	private String title;
	private String author;
	private double price;
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void Discount(double disc){
		if(price<0) {
			System.err.println("Error : Book Price cannot be negative.");
			if(disc<0) {
				System.err.println("Error: Invalid discount percentage.");
				System.exit(0);
			}
			System.exit(0);
		}
		
		disc/=100;
		price=price-(disc*price);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}
