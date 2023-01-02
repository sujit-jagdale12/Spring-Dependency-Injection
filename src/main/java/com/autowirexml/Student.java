package com.autowirexml;

public class Student {

	private int sid;
	private String sname;
	private Address address;
	public Student() {
	}
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
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address:" + address + "]";
	}
	
	
	
}
