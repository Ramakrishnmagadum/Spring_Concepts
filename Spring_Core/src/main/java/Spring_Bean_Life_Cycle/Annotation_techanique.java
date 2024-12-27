package Spring_Bean_Life_Cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation_techanique {
public static void main(String[] args) {
	//in this techanique we are using the annotation to call init and destory method..
	//to enable the annotation we need to add <context:annotation-component /> tag need to add in .xml file
	//this tag will scan all the annotation and work with that.....
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring_Bean_Life_Cycle/Bean_life_cycle.xml");
	Annotation_bean bean=(Annotation_bean) context.getBean("annotationbean");
	System.out.println(bean);
	
	AbstractApplicationContext abcontext=(AbstractApplicationContext) context;
	abcontext.registerShutdownHook();
}
}
