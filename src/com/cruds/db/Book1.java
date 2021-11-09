package com.cruds.db;

public class Book1 {
	public int BookId;
	public String title;
	public double price;
	public Book1(int BookId, String title, double price) {
		super();
		this.BookId = BookId;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book1 [BookId=" + BookId + ", title=" + title + ", price=" + price + "]";
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printBook(){
		System.out.println("BookId:"+BookId+"title"+title+"price"+price);
	}

}
