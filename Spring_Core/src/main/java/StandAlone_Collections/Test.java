package StandAlone_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("StandAlone_Collections/StandAlone_Collection.xml");
	StudentBean bean=(StudentBean) context.getBean("student");
	//it will print the list along with we can specify the list type also.....
	System.out.println(bean);
	System.out.println(bean.getSubject().getClass().getName());
	System.out.println(bean.getMarks().getClass().getName());
	
	//this will aslo use same list by just using that ID
	StudentBean beanlist1=(StudentBean) context.getBean("studentcopy");
    System.out.println(beanlist1);
	System.out.println(beanlist1.getSubject().getClass().getName());
	System.out.println(beanlist1.getMarks().getClass().getName());
	
	
	
	StudentBean bean2=(StudentBean) context.getBean("student2");
	System.out.println(bean2);
	System.out.println(bean2.getSubject().getClass().getName());
	System.out.println(bean2.getMarks().getClass().getName());	
}
}
