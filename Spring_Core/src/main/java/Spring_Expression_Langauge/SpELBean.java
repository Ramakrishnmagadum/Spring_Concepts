package Spring_Expression_Langauge;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpELBean {
	//Arthimatic operation
	@Value("#{12+12-4/4}")
	int num;
	
	//with ternary operater
	@Value("#{12>3 ? 12 : 3}")
	double num2;
	
	//calling static method 
	@Value("#{T(java.lang.Math).sqrt(144)}")
	int num3;
	
	//calling static varible
	@Value("#{T(java.lang.Integer).MAX_VALUE }")
	int num4;
	
	//creating object 
	@Value("#{new java.lang.String('Ramakrishna')}")
	String name;
	
	//passing boolena value
	@Value("#{8>4}")
	boolean falg;

	@Override
	public String toString() {
		return "SpELBean [num=" + num + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", name=" + name
				+ ", falg=" + falg + "]";
	}	
}
