package Spring_Bean_Life_Cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XML_techanique {
public static void main(String[] args) {
	//first .xml file will load
	// Bean Definition will create 
	//Bean insitiated with default values , exmple for String null and for integer - "0"...
	// After Bean object will create with Injection will value will update
	//after this Init Method will call
	//after this Bean will give we can use it and customize it also...
	//after this bean will go to destory process....
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring_Bean_Life_Cycle/Bean_life_cycle.xml");
	
//	to invoke destory method shutdownhook need to register...
	//enabling the shutdownhook
	AbstractApplicationContext abcontext=(AbstractApplicationContext) context;
	abcontext.registerShutdownHook();
	
	
	XmlBean bean=(XmlBean) context.getBean("XmlBean");
	System.out.println(bean);
	
	//after this line end method will call ---it will clean up ..

	
	
}
}
