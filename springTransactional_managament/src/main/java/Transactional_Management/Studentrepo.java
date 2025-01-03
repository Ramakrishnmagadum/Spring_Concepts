package Transactional_Management;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Studentrepo {
	@Autowired
	JdbcTemplate template;
	
	
	public void savestudentinfo() {
		
		String sql="insert into studentbean values(? , ?)";
		
//		case 1:
//		----	HANDLED THE EXCEPTION-----
		//if  i catch the exception ,then method will not that exception is coming
		//so it will not roolback ...it will save the data 
//		try {
//		for(int i=1;i<=10;i++) {
//			StudentBean student =new StudentBean();
//			student.setAge(i);
//			student.setName("name "+i);
//			template.update(sql, student.getAge(),student.getName());
//			System.out.println("inserted name "+i);
//			//i will throw exception before completing whole task
//			if(i==7) {
//				throw new  RuntimeException("runtime exception throwing ");
//			}
//		}
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		case :2
//		-----IF THROWING THE CHECKED EXCEPTION IT WILL NOT ROOLBACK THE DATA------
		//BCZ 	it will consider by default only uncheked Exception (menas RuntimeException)
//		for(int i=1;i<=10;i++) {
//			StudentBean student =new StudentBean();
//			student.setAge(i);
//			student.setName("name "+i);
//			template.update(sql, student.getAge(),student.getName());
//			System.out.println("inserted name "+i);
//			//i will throw exception before completing whole task
//			if(i==7) {
//				throw new  Exception("runtime exception throwing ");
//			}
//		}
		
		
//		case :3
		for (int i = 1; i <= 10; i++) {
			StudentBean student = new StudentBean();
			student.setAge(i);
			student.setName("name " + i);
			template.update(sql, student.getAge(), student.getName());
			System.out.println("inserted name " + i);
			// i will throw exception before completing whole task
			if (i == 7) {
				throw new RuntimeException("runtime exception throwing ");
			}
		}
	}

}
