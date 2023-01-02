package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		/*
		 * ApplicationContext app1 = new
		 * ClassPathXmlApplicationContext("com/lifecycle/lifecycle.xml"); Book b2
		 * =(Book) app1.getBean("book1"); System.out.println(b2);
		 * 
		 * By using this interface destroy method does not call
		 */

		// To call destroy method use this interface
		AbstractApplicationContext app = new ClassPathXmlApplicationContext("com/lifecycle/lifecycle.xml");
		Book b1 = (Book) app.getBean("book1");
		System.out.println(b1);
		app.registerShutdownHook();

		//By implementing initializationBean and disposalBean interface
		System.out.println("====================");
		Note note = (Note) app.getBean("note");
		System.out.println(note);

		
		//By using annotations  To enable annotation add context:Annotation-config in xml file
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Pen p1=(Pen) app.getBean("pen");
		System.out.println(p1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 * First of all the init method invokes for all the beans then corresponding
		 * service method works then destroy of method happens
		 * 
		 * By implementing initializationBean and disposalBean interface both init and
		 * destroy method automatically invoke
		 */
	}

}
