package ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//By Using BenaFactory Interface
public class Primitive_Data_Constructor_injecetion {
public static void main(String[] args) {

	Resource resource=new ClassPathResource("ConstructorInjection/Constructor_injection.xml"); //first will store in Resource object and then pass to BeanFactory ...
	BeanFactory factory=new XmlBeanFactory(resource);
	primitive_Bean bean=(primitive_Bean) factory.getBean("primitive"); //first constructor will call ,Bcz passing Int Type Data...
	System.out.println(bean);
	primitive_Bean bean1=(primitive_Bean) factory.getBean("primitive1");//third constructor will call ,Bcz if data type not mentioned then it will consider as String...
	System.out.println(bean1);
	primitive_Bean bean2=(primitive_Bean) factory.getBean("primitive2");
	System.out.println(bean2);
}
}
