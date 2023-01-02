package com.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext app=new ClassPathXmlApplicationContext("com/autowirexml/xmlautowire.xml");
		
		
		//for use of byName keep the same name of ref var in pojo class & xml file
//		System.out.println("By Using byName autowire");
//		Student s1=(Student) app.getBean("stud");
//		System.out.println(s1);
		
		//This is autowired by the type bean variable present in the xml file
//		System.out.println("\nBy Using byType autowire");
//		Student s2=(Student) app.getBean("stud");
//		System.out.println(s2);
		
		//This is auto-wired by using the parameterized constructor
		System.out.println("\nBy Using constructor autowire");
		Student s3=(Student) app.getBean("stud");
		System.out.println(s3);
		
	}

}
