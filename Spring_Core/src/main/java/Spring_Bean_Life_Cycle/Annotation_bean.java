package Spring_Bean_Life_Cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation_bean {
	String name;
	int age;

	public void setName(String name) {
		System.out.println("annotation setname method");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("annotation setage method...");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Annotation_bean [name=" + name + ", age=" + age + "]";
	}
	
	@PreDestroy
	public void end(){
		System.out.println("destroy method called");	
	}
	@PostConstruct
	public void start() {
		System.out.println("init method called");
	}


}
