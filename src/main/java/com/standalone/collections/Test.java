package com.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("com/standalone/collections/standalone.xml");

		Friend friend = (Friend) app.getBean("frd");
		System.out.println(friend);
		
		//To check declared collection is used or not
		System.out.println(friend.getNames().getClass().getName());
		System.out.println(friend.getCities().getClass().getName());
		System.out.println(friend.getHobbies().getClass().getName());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(friend.getProperties());
	}

}
