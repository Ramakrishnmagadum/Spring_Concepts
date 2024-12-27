package Autowiring_Annotation;

public class AML_Autowiring_target_Bean {

XML_Autowiring_Dependent_Bean bean;

public void setBean(XML_Autowiring_Dependent_Bean bean) {
	this.bean = bean;
}

@Override
public String toString() {
	return "AML_Autowiring_target_Bean [bean=" + bean + "]";
}
}
