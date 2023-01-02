package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int sid;
	private String sname;
	@Autowired
	@Qualifier("add")
	private Address address; 

	public Student() {
	}

//	@Autowired
	public Student(int sid, String sname, Address address) {
		System.out.println("Inside constructor");
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Annotation on setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address:" + address + "]";
	}

}
