package Transactional_Management_2;

import java.lang.reflect.Proxy;
import java.sql.Connection;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.mysql.cj.jdbc.ConnectionImpl;

@Component
@Aspect
public class TrackingAop {

	@Before("execution(* StudentService.savestudent())")
	public void beforemethod() {
		System.out.println("before StudentService.savestudent()");
	}

	@Before("execution(* Studentrepo.savestudentinfo(..))")
	public void beforemethod1() {
		System.out.println("before Studentrepo.savestudentinfo()");
	}

	@Before("target(com.mysql.cj.jdbc.ConnectionImpl)")
	public void beforemethod2() {
		System.out.println("commit");
	}

//    @Around("target(com.mysql.cj.jdbc.ConnectionImpl)")
	@Around("target(javax.sql.DataSource)")
	public Object beforemethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		// pre processing
		System.out.println("Method name " + proceedingJoinPoint.getSignature());

		// actual process
		Object returnvalue = proceedingJoinPoint.proceed();
		System.out.println(returnvalue);
		if (returnvalue instanceof Connection) {
			connectionimplinvocationhandler connectionimplinvocationhandler = new connectionimplinvocationhandler(
					(Connection) returnvalue);
			Connection connection = (Connection) Proxy.newProxyInstance(Connection.class.getClassLoader(),
					new Class[] { Connection.class }, connectionimplinvocationhandler);
			return connection;
		}
		// post processing
		return returnvalue;

	}

}
