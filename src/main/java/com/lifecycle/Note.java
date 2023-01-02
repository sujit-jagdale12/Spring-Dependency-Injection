package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Note implements InitializingBean, DisposableBean {

	private double price;
	private String color;

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting note value");
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Note [price=" + price + ", color=" + color + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// By default this is init method
		System.out.println("Automatic init by InitializingBean interface NoteClass");

	}

	public void destroy() throws Exception {
		// destroy method
		System.out.println("Automatic destroy by DisposableBean interface NoteClass");
	}

}
