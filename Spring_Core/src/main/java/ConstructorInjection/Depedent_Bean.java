package ConstructorInjection;

public class Depedent_Bean {
String city;
int value;
public Depedent_Bean(String city) {
	super();
	this.city = city;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public Depedent_Bean(String city, int value) {
	super();
	this.city = city;
	this.value = value;
}
@Override
public String toString() {
	return "Depedent_Bean city=" + city + ", value=" + value ;
}



}
