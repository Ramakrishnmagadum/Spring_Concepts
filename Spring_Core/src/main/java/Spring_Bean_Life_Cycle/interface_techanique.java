package Spring_Bean_Life_Cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class interface_techanique {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring_Bean_Life_Cycle/Bean_life_cycle.xml");
	Interface_type_bean bean=(Interface_type_bean) context.getBean("interfacebean");
	System.out.println(bean);
	
	AbstractApplicationContext abcontext=(AbstractApplicationContext) context;
	abcontext.registerShutdownHook();
}
}
