package Setter_injection;

public class primitive_Bean {
int num;
String name;
String surname;


public void setNum(int num) {
	this.num = num;
}


public void setName(String name) {
	this.name = name;
}


public void setSurname(String surname) {
	this.surname = surname;
}


@Override
public String toString() {
	return "primitive_Bean [num=" + num + ", name=" + name + ", surname=" + surname + "]";
}

}
