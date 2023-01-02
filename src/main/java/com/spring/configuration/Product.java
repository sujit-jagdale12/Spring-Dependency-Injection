package com.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Product {
	@Value("121")
	private int pId;
	@Value("Biscuit")
	private String pName;

//	@Autowired
	private Maggie maggie;

	public Product(Maggie maggie) {
		this.maggie = maggie;
	}

	public Product() {
	}

	public Maggie getMaggie() {
		return maggie;
	}

	public void setMaggie(Maggie maggie) {
		this.maggie = maggie;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + "]";
	}

	public void billGenerate() {
		System.out.println("Generating bill");
	}

}
