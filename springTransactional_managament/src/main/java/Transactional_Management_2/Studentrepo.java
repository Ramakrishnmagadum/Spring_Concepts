package Transactional_Management_2;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Studentrepo {
	@Autowired
	JdbcTemplate template;
	
	
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
	public void savestudentinfo(StudentBean student) {
		
		String sql="insert into studentbean values(? , ?)";

		
			template.update(sql, student.getAge(), student.getName());
			
			// i will throw exception before completing whole task
			
		}
	}

