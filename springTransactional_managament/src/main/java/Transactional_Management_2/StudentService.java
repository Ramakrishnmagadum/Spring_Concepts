package Transactional_Management_2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
	@Autowired
	Studentrepo studentrepo;
	
	//if we used this annotation on top of the any class then ---> every method inside that class will manage transaction...
	//by default Propagation.REQUIRED and we can change it...
	@Transactional(propagation = Propagation.REQUIRED)
	public void savestudent() {
		for (int i = 1; i <= 10; i++) {
			StudentBean student = new StudentBean();
			student.setAge(i);
			student.setName("name " + i);
		studentrepo.savestudentinfo(student);	
		System.out.println("inserted name " + i);
		
//		if(i==7) {
//			throw new RuntimeException();
//		}
		}
	}

}
