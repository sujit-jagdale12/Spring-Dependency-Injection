package com.course;

import java.util.List;

public class Qspiders {

	private int sid;
	private String sname;
	private Certificate certi;
	private List<String> courses;

	public Qspiders(int sid, String sname, Certificate certi, List<String> courses) {
		this.sid = sid;
		this.sname = sname;
		this.certi = certi;
		this.courses = courses;
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

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Qspiders() {
	}

	@Override
	public String toString() {
		return "Qspiders [sid=" + sid + ", sname=" + sname + ", certi=" + certi + ", courses=" + courses + "]";
	}

}
