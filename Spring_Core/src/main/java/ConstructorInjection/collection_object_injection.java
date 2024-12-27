package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collection_object_injection {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ConstructorInjection/Constructor_injection.xml");
		List_Object_Bean bean = (List_Object_Bean) context.getBean("listobject");
		System.out.println(bean);
	}

}
