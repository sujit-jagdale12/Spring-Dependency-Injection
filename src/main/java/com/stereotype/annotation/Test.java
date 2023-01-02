package com.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("com/stereotype/annotation/stereotype.xml");

		Stud s1=app.getBean("stud",Stud.class);
		System.out.println(s1);
		
		System.out.println("Hobbies: "+s1.getHobbies());
		
	}

}
