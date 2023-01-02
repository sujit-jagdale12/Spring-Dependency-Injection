package PrimitiveInjecion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		System.out.println("Internally it uses setter and getters");
		System.out.println("Using property tag value as element");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("PrimitiveInjecion/config.xml");

		Student s1 = context.getBean("student",Student.class);
		System.out.println(s1);

		
		
		
		
		
		
		
		
//		System.out.println();
//		System.out.println("Using value tag value as attribute");
//		Student s2 = (Student) context.getBean("Student2");
//		System.out.println(s2);
//		
//		System.out.println();
//		System.out.println("Using p schema");
//		Student s3 = (Student) context.getBean("Student3");
//		System.out.println(s3);
	}
}
