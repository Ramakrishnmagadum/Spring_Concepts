package Transactional_Management_Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
	@Autowired
	Studentrepo studentrepo;
	
	@Transactional(propagation = Propagation.REQUIRED)//By default this propagation will present...
	public void savestudentinfo() {
		for(int i=1;i<=10;i++) {
			StudentBean student=new StudentBean();
			student.setAge(i);
			student.setName("name "+i);
			studentrepo.savestudent(student);
			System.out.println("name "+i +"saved");
			if(i==7) {
				throw new RuntimeException();
			}
		}	
	}
}
