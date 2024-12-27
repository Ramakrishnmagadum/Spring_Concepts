package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class All_In_One_Constructor_Injection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ConstructorInjection/Constructor_injection.xml");
		All_In_One_Bean bean = (All_In_One_Bean) context.getBean("all_in_one_bean");
		System.out.println(bean);
	}
}
