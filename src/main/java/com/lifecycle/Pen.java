package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pen {

	private String pname;
	private int price;
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen [pname=" + pname + ", price=" + price + "]";
	}
	
	@PostConstruct
	public void starting() {
		System.out.println("Annotation init method!!!");
	}
	@PreDestroy
	public void ending() {
		System.out.println("Annotation destroy method!!!");
	}
}
