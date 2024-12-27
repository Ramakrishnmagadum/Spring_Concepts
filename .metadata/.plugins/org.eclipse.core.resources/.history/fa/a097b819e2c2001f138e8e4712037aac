package Proxy_Design_Pattern;

public class Student_proxy  extends Studentimpl{

	Attendence attendence;
	Student_proxy(Attendence attendence) {
		super(attendence);
		this.attendence=attendence;
		
	}
	
	@Override
	public void attendlession() {
		if(!attendence.isIspresent()) {
			throw new RuntimeException("dont allow student to attend the class");
		}
		super.attendlession();
	}

}
