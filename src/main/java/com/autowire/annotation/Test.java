package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext app=new ClassPathXmlApplicationContext("com/autowire/annotation/annotation.xml");
		
		
		//@Autowired Annotation on  reference variable
//		System.out.println("By Using @Autowire annotation on reference variable");
//		Student s1=(Student) app.getBean("stud");
//		System.out.println(s1);
		
		//@Autowired on setter method
//		System.out.println("\nBy Using  @Autowire Annotation on setter" );
//		Student s2=(Student) app.getBean("stud");
//		System.out.println(s2);
		
//		//@Autowired on constructor
//		System.out.println("\nBy Using @Autowire annotation on constructor ");
		Student s3=(Student) app.getBean("stud");
		System.out.println(s3);
		
		
		/*
		 * If we have more than one bean of same class then spring confuses to avoid that confusion 
		 * we have to declare which bean to call
		 * for that use @Qualifier annotation-Here give the same name as the Used ref-variable
		 * 
		 */
		
	}

}
