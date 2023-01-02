package com.lifecycle;

public class Book {

	private int bookId;
	private String bookName;
	private double price;
	public Book() {
	}
	public Book(int bookId, String bookName, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		System.out.println("Setting book values");
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}
	//You can give any name but in xml file provide it correctly
	public void initialization() {
		System.out.println("Calling Book init...");
	}
	public void destroying() {
		System.out.println("Calling Book destroy...");
	}
	
}
