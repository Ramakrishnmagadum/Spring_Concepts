package Reflection_APi;

public class Student_proxy   {

	
	 Student_proxy() {
		super();
	}

	Attendence attendence;
	Student_proxy(Attendence attendence) {
		this.attendence=attendence;	
	}
	
	public void attendlession() {
		System.out.println("attendlession method with-out parameter");
	}
	
	public void attendlession(Integer num) {
		System.out.println("attendlession method with parameter "+ num);
	}
	
	public void attendlession(Integer num,String name ,String surname) {
		System.out.println("attendlession method with 3 parameter "+ num+ " name "+ name+ " surname "+surname);
	}


}
