package com.spring.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext app = new AnnotationConfigApplicationContext(Configure.class);

		Product p1 = app.getBean("maggie", Product.class);

		System.out.println(p1);
		
		System.out.println(p1.getMaggie());
		p1.billGenerate();
		System.out.println("===========================================");

//		CompanyBean c1 = app.getBean("getCompany", CompanyBean.class);
//		System.out.println(c1);
//		
	}
}
