package Transactional_Management_Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
	StudentService  student=context.getBean("studentService",StudentService.class);
	student.savestudentinfo();
	System.out.println("completed");
}
}
