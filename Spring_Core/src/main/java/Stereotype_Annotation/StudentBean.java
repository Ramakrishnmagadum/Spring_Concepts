package Stereotype_Annotation;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component //this component will remove the bean tag in .xml and file and this will create bean fro this calss , by deafult name of this bean is class name
@Component("student")//By default name was studentBean but we can change it, and we can give any name....
public class StudentBean {
	
	@Value("123")
	int age;
	@Value("ramakrishna")
	String name;
	
	//how to add values for collection by using @value 
	//just create standalone collection in .xml and give theier key to here ..
	@Value("#{list}")
	List<Integer> num;
	
	
	public int getAge() {
		return age;
	}
	
	//we can set value here also .... and first priority it will give to this..... 
	@Value("12")
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getNum() {
		return num;
	}

	public void setNum(List<Integer> num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "StudentBean [age=" + age + ", name=" + name + ", num=" + num + "]";
	}
	
}
