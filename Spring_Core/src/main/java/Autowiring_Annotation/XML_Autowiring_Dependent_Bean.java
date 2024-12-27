package Autowiring_Annotation;

public class XML_Autowiring_Dependent_Bean {
	int age;
	String name;
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "XML_Autowiring_Dependent_Bean [age=" + age + ", name=" + name + "]";
	}
}
