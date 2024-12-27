package Annotation_Concept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Using_Annotation {
	public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("Annotation_Concept/Annotation_config.xml");
    Annotation_bean bean =(Annotation_bean) context.getBean("target_annotation");
    System.out.println(bean);
	}
}
