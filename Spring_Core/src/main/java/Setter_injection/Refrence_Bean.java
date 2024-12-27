package Setter_injection;

public class Refrence_Bean {
String city;
primitive_Bean bean;
public void setCity(String city) {
	this.city = city;
}
public void setBean(primitive_Bean bean) {
	this.bean = bean;
}
@Override
public String toString() {
	return "Refrence_Bean [city=" + city + ", bean=" + bean + "]";
}

}
