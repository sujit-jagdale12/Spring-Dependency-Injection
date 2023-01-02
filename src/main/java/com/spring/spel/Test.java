package com.spring.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		ApplicationContext app=new ClassPathXmlApplicationContext("com/spring/spel/spel.xml");
		
		Demo d1=app.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		SpelExpressionParser spel= new SpelExpressionParser();
		Expression ex= spel.parseExpression("20+20");
		System.out.println(ex.getValue());
		
		
		System.out.println("Static method sqrt: "+d1.getSqrt());
		System.out.println("Value of static variable PI: "+d1.getPi());
		System.out.println("Creating new object: "+d1.getName() );
		
		System.out.println(d1.sum());
		System.out.println(d1.isDone());
	}

}
