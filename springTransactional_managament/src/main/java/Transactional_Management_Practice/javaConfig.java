package Transactional_Management_Practice;

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

@EnableTransactionManagement
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class javaConfig {
	
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
	
	@Bean
	public PlatformTransactionManager transactionalmanager() {
		return new DataSourceTransactionManager(datasource());
	}
 
}
