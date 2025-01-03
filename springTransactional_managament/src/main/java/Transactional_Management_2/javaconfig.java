package Transactional_Management_2;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement //this annotation will enable the transactional management ...it will scan the @trasnactional Annotation 
@EnableAspectJAutoProxy
public class javaconfig {
	
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springdatabase");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	
	@Bean
	public JdbcTemplate jdbctemplate() {
		return new JdbcTemplate(datasource());
	}
	
	
	//to manage transaction need to create object of this...
	@Bean
	public PlatformTransactionManager transaction() {
		return new DataSourceTransactionManager(datasource());
	}

}
