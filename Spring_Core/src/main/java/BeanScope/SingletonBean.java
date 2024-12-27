package BeanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonebean")
//providing scope by Annotation
@Scope("singleton")
public class SingletonBean {
	@Value("12")
	int age;
	@Value("ramakrishna")
	String name;
	@Override
	public String toString() {
		return "SingletonBean [age=" + age + ", name=" + name + "]";
	}
}
