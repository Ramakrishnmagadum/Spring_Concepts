package Autowiring_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XML_Techanique {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Autowiring_Annotation/Autowiring.xml");
//	AML_Autowiring_target_Bean bean =(AML_Autowiring_target_Bean) context.getBean("xml_target");
//	System.out.println(bean);
	
	AML_Autowiring_target_Bean bean2 =(AML_Autowiring_target_Bean) context.getBean("xml_target_type");
	System.out.println(bean2);
}
}
