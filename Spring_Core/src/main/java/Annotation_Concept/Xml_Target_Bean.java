package Annotation_Concept;

public class Xml_Target_Bean {
	Xml_Dependent_Bean bean;
   String surname;
   
   
	public Xml_Target_Bean() {
	super();
	System.out.println("inside Default Constructor");
}

	public Xml_Target_Bean(Xml_Dependent_Bean bean) {
	super();
	this.bean = bean;
}

	public Xml_Target_Bean(String surname) {
		super();
		this.surname = surname;
		System.out.println("inside one paramter Constructor");
	}

	public Xml_Target_Bean(Xml_Dependent_Bean bean, String surname) {
	super();
	this.bean = bean;
	this.surname = surname;
	System.out.println("inside two parameter Constructor");
}

	public void setBean(Xml_Dependent_Bean bean) {
		this.bean = bean;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Xml_Target_Bean [bean=" + bean + ", surname=" + surname + "]";
	}

	

}
