package springHibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.StudentDao;
import Entities.StudentBean;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
	StudentDao dao=context.getBean("studentdao", StudentDao.class);
	StudentBean std=new StudentBean();
	std.setAge(340);
//	std.setName("kj");
	
	//to insert into database
//	dao.insert(std);
	
	//to update
//	dao.update(std);
	
	//to delete
//	dao.delete(std);
	
	//to get one row
	StudentBean bean=dao.get(std);
	System.out.println(bean);
	
	//to get all the rows
	List<StudentBean> list = dao.getAll(StudentBean.class);
	for(StudentBean list2:list) {
		System.out.println(list2);
	}
	System.out.println("completed");
}
}
