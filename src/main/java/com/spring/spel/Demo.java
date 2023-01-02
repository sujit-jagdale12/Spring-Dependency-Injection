package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{12+23*2}")
	private int x;
	@Value("#{100/10}")
	private int y;

	// To call static method
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double sqrt;

	// To call static variable
	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	// To create new object
	@Value("#{ new String('Sujit Jagdale')}")
	private String name;

	// Boolean spring expression language
	// Put any value that returns true
	@Value("#{8>1}")
	private boolean isDone;

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone; 
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSqrt() {
		return sqrt;
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int sum() {
		return x + y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}

}
