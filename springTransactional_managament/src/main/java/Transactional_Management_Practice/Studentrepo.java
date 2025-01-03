package Transactional_Management_Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Studentrepo {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void savestudent(StudentBean student) {
		String sql="insert into studentbean values(? ,? )";
		jdbcTemplate.update(sql,student.getAge(),student.getName());
	}
}
