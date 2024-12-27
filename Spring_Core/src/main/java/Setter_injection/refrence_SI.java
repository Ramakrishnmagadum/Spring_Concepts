package Setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refrence_SI {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Setter_injection/Setter_injection.xml");
	Refrence_Bean bean=(Refrence_Bean) context.getBean("refrence");
	System.out.println(bean);
	
	Refrence_Bean bean1=(Refrence_Bean) context.getBean("refrence1");
	System.out.println(bean1);
	
}
}
