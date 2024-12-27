package Spring_AOP_By_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring_AOP_By_Annotation/Spring_Aop.xml");
	MyService bean =(MyService) context.getBean("myService");
	bean.method1();
	bean.method1("ram");
	bean.getmethod1();
	bean.getmethod2("ram");
}
}
