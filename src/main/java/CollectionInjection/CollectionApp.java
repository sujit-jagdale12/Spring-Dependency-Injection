package CollectionInjection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionInjection/Collection.config.xml");

		Employee e1 = (Employee) context.getBean("Emp1");

		System.out.println("Ename: " + e1.getEname());
		System.out.println("Phones: " + e1.getPhones());
		System.out.println("Address: " + e1.getAddress());
		System.out.println("Courses: " + e1.getCourses());
		System.out.println(e1.getProps());

		//Get specific collection names
		System.out.println(e1.getPhones().getClass().getName());
		System.out.println(e1.getAddress().getClass().getName());
		System.out.println(e1.getCourses().getClass().getName());
	}
}
