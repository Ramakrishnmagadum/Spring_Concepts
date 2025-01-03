package Dao;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import Entities.StudentBean;

public class StudentDao {
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional(readOnly = false)
	public int insert(StudentBean std) {
		int i=(Integer) this.template.save(std);
		return i;
	}
	
	@Transactional(readOnly = false)
	public void update(StudentBean std) {
		 this.template.update(std);
		
	}
	
	@Transactional(readOnly = false)
	public void delete(StudentBean std) {
		
		 this.template.delete(std);
	}
	
	public StudentBean get(StudentBean std) {
		
		 return this.template.get( StudentBean.class,120);
	}
	
	public List<StudentBean> getAll(Class<StudentBean> class1) {
		
		 return this.template.loadAll(class1);
	}	
}
