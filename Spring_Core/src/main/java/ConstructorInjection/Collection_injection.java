package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collection_injection {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection/Constructor_injection.xml");
 
		// list Injection
		List_Bean bean = (List_Bean) context.getBean("list1");
		System.out.println(bean);

		// Map Injection
		Map_Bean bean1 = (Map_Bean) context.getBean("map1");
		System.out.println(bean1);

		// Set Injection
		Set_Bean bean2 = (Set_Bean) context.getBean("set1");
		System.out.println(bean2);
	}

}
