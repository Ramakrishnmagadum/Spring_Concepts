package Setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Primitive_Injection {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Setter_injection/Setter_injection.xml");
	primitive_Bean bean=(primitive_Bean) context.getBean("primitive_bean");
	System.out.println(bean);
	primitive_Bean bean2=(primitive_Bean) context.getBean("primitive_bean1");
	System.out.println(bean2);
}
}
