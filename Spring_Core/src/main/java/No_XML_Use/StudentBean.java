package No_XML_Use;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component //it will Create object and return obejct
public class StudentBean {
	@Value("12")
	int age;
	@Value("ramakrishna")
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentBean [age=" + age + ", name=" + name + "]";
	}
}
