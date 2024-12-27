package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentBean {
	@Id
	int age;
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
