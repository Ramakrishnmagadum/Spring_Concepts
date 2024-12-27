package Stereotype_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoType_Annotations{
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Stereotype_Annotation/Stereotype_Config.xml");
	StudentBean bean =(StudentBean) context.getBean("student");
	
	System.out.println(bean);
}
}
