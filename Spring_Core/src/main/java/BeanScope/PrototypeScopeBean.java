package BeanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypebean")
//providing scope by Annotation
@Scope("prototype")
public class PrototypeScopeBean {
	@Value("12")
	int age;
	@Value("ramakrishna")
	String name;
	@Override
	public String toString() {
		return "PrototypeScopeBean [age=" + age + ", name=" + name + "]";
	}
}
