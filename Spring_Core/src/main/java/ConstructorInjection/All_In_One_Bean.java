package ConstructorInjection;

import java.util.List;

public class All_In_One_Bean {
int age;
String name;
List_Bean refrence;
List<String> cities;
List<List_Bean> listbean;
public All_In_One_Bean(int age, String name, List_Bean refrence, List<String> cities, List<List_Bean> listbean) {
	super();
	this.age = age;
	this.name = name;
	this.refrence = refrence;
	this.cities = cities;
	this.listbean = listbean;
}
@Override
public String toString() {
	return "All_In_One_Bean [age=" + age + ", name=" + name + ", refrence=" + refrence + ", cities=" + cities
			+ ", listbean=" + listbean + "]";
}

}
