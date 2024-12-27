package StandAlone_Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class StudentBean {

	String name;
	List<String> subject;
	Map<Integer , Integer> marks;
	Properties props;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}
	public List<String> getSubject() {
		return subject;
	}
	public Map<Integer, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<Integer, Integer> marks) {
		this.marks = marks;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", subject=" + subject + ", marks=" + marks + ", props=" + props + "]";
	}
}
