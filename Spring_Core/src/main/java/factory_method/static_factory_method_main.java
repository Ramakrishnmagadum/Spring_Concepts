package factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class static_factory_method_main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("factory_method/factory_method.xml");
//	 A static factory method that returns instance of its own class
	static_factory_method bean=(static_factory_method) context.getBean("bean");
	bean.msg();
	

//	A static factory method that returns instance of another class.
	A bean2=(A) context.getBean("printable");
	bean2.print();
	
//	A static factory method that returns instance of another class.
	B bean3=(B) context.getBean("printable2");
	bean3.print();
	
//	A non-static factory method that returns instance of another class.
	B bean4=(B) context.getBean("printable3");
	bean4.print();
}
}
