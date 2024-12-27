package Spring_Aop_By_Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_XML {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring_Aop_By_Xml/Spring_Aop.xml");
	MyServiceXML bean=(MyServiceXML) context.getBean("service");
	bean.service();
}
}
