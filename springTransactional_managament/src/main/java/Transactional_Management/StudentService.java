package Transactional_Management;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	Studentrepo studentrepo;
	
//	@Transactional(dontRollbackOn  = RuntimeException.class)  ---it will mention donot rollback on this RuntimeException...
//	@Transactional(RollbackOn  = RuntimeException.class)  ---it will mention  rollback on this Exception... By default if throwing the checked execpion it will not roll back ,,but by this we can roll back
	
	@Transactional //if we used this annotation on top of the any class then ---> every method inside that class will manage transaction...
	public void savestudent() {
		studentrepo.savestudentinfo();	
	}

}
