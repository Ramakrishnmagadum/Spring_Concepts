package Annotation_Concept;

import org.springframework.beans.factory.annotation.Autowired;

public class Annotation_bean {

	
	Xml_Dependent_Bean bean;

	public Annotation_bean() {
	super();
	System.out.println("inside Default Constructor");
}

	@Autowired
	public Annotation_bean(Xml_Dependent_Bean bean) {
	super();
	System.out.println("inside paramter Constructor");
	this.bean = bean;
}

	
	public void setBean(Xml_Dependent_Bean bean) {
		this.bean = bean;
		System.out.println("inside settter Method");
	}


	@Override
	public String toString() {
		return "Annotation_bean [bean=" + bean + "]";
	}
}
