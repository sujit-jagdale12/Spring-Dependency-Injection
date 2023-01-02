package com.course;

public class Certificate {

	private String cname;
	private int duration;

	public Certificate() {
	}

	public Certificate(String cname, int duration) {
		this.cname = cname;
		this.duration = duration;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Certificate [cname=" + cname + ", duration=" + duration + "]";
	}

}
