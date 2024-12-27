package No_XML_Use;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan   --it will scan @component scan and it will create Object and it will return object of that...
public class Java_Config {

	//By Default method name is Bean name---
	@Bean
	public StudentBean getstudent() {
		return new StudentBean();
	}
}
