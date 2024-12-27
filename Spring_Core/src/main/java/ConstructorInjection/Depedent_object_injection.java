package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Depedent_object_injection {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("ConstructorInjection/Constructor_injection.xml");
	Target_Bean bean=(Target_Bean) context.getBean("target1");
	System.out.println(bean);
}
}
