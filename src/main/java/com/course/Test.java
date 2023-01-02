package com.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/course/classcerti.xml");
		
		Qspiders s1=(Qspiders) context.getBean("pjca10");
		
		System.out.println("Student Id: "+s1.getSid());
		System.out.println("Student Name: "+s1.getSname());
		System.out.println("Certificate: "+s1.getCerti().getCname()+"\nDuration: "+s1.getCerti().getDuration());
		
		System.out.println("Courses: "+s1.getCourses());
	}

}
