package BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("BeanScope/BeanScopeConfig.xml");
	SingletonBean singleton=(SingletonBean) context.getBean("singletonebean");
	System.out.println(singleton);
	
	
	SingletonBean singleton2=(SingletonBean) context.getBean("singletonebean");
	System.out.println(singleton2);
//	----both hachcode is same beacuse both are returning same instanace
	System.out.println(singleton.hashCode());
	System.out.println(singleton2.hashCode());
	
	PrototypeScopeBean prototype=(PrototypeScopeBean) context.getBean("prototypebean");
	System.out.println(prototype);
	
	
	PrototypeScopeBean prototype2=(PrototypeScopeBean) context.getBean("prototypebean");
	System.out.println(prototype2);
	//both hashcode are different because both are returing different different object..
	System.out.println(prototype.hashCode());
	System.out.println(prototype2.hashCode());
	
	
}
}
