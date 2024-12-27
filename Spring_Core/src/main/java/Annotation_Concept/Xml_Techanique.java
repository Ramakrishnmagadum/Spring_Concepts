package Annotation_Concept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Xml_Techanique {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Annotation_Concept/Annotation_config.xml");
//	----byName----
//	Xml_Target_Bean bean=(Xml_Target_Bean) context.getBean("target_byName");
//	System.out.println(bean);
	
//	--byType
//	Xml_Target_Bean bean=(Xml_Target_Bean) context.getBean("target_byType");
//	System.out.println(bean);
	
//	--Constructor
	Xml_Target_Bean bean=(Xml_Target_Bean) context.getBean("target_constructor");
	System.out.println(bean);	
}
}
