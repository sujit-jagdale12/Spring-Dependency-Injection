package ConstructorAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {

		//By default the first passed constructor called that int or double 
		//By using type we can call the particular constructor
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorAmbiguity/ambi.xml");

		Addition addition = (Addition) context.getBean("addition");
		System.out.println(addition.getNum1());
		System.out.println(addition.getNum2());
		addition.sum();
	}

}
