package Transactional_Management_Practice;

import java.lang.reflect.Proxy;
import java.sql.Connection;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.mysql.cj.jdbc.ConnectionImpl;
@Component
@Aspect
public class createConnectionTracker {
	
	@Around("target(javax.sql.DataSource)")
	public Object tracker(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("method name "+proceedingJoinPoint.getSignature().getName());
		
		Object returnvalue =proceedingJoinPoint.proceed();
		System.out.println(returnvalue);
		if (returnvalue instanceof Connection) {
		connectionInvocationtracker handler=new connectionInvocationtracker((Connection)returnvalue);
		Connection connection = (Connection) Proxy.newProxyInstance(Connection.class.getClassLoader(), new Class[] {Connection.class}, handler);
		return connection;
		}
		return returnvalue;
	}

}
