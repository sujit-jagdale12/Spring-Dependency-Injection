package com.spring.configuration;

import org.springframework.beans.factory.annotation.Value;

public class CompanyBean {
	@Value("421")
	private int cId;
	@Value("TATA")
	private String cName;
	@Value("Pune")
	private String Clocation;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getClocation() {
		return Clocation;
	}

	public void setClocation(String clocation) {
		Clocation = clocation;
	}

	@Override
	public String toString() {
		return "CompanyBean [cId=" + cId + ", cName=" + cName + ", Clocation=" + Clocation + "]";
	}

}
