package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("constructorInjection/Constructorconfig.xml");
		
		Person p1=(Person) context.getBean("person1");
		System.out.println("Using value tag");
		System.out.println(p1);
		
		
		Person p2=(Person) context.getBean("person2");
		System.out.println("\nUsing value attribute");
		System.out.println(p2);
		
		
		Person p3=(Person) context.getBean("person3");
		System.out.println("\nUsing c schema");
		System.out.println(p3);
	}

}
