package com.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Maggie {
	@Value("Nestle")
	private String mName;
	@Value("20")
	private double price;

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Maggie [mName=" + mName + ", price=" + price + "]";
	}

}
