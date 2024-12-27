package Spring_Expression_Langauge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring_Expression_Langauge/SpELConfig.xml");
	SpELBean bean= context.getBean("spELBean",SpELBean.class);
	System.out.println(bean);
}
}
