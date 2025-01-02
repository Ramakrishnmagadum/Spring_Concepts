package Transactional_Management_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
	StudentService  student=(StudentService) context.getBean("studentService");
	student.savestudent();
	System.out.println("student saved");
}
}
