package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefApp {
	
	public static void main(String[] args) { 
		
		@SuppressWarnings("resource")
		ApplicationContext  context=new ClassPathXmlApplicationContext("com/spring/ref/refconfig.xml");
		
	    A obj=(A) context.getBean("Aref");
	    
	    System.out.println(obj);
	    
	    System.out.println("X: "+obj.getX());
	    System.out.println("Y: "+obj.getObj().getY());
	}

}
