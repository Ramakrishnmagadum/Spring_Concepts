package No_XML_Use;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(Java_Config.class);
	//We can use Class name also it will give object of that class
//	StudentBean bean=(StudentBean) context.getBean(StudentBean.class); 
	StudentBean bean=(StudentBean) context.getBean("getstudent"); 
	System.out.println(bean);	
}
}
