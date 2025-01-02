package Transactional_Management_Practice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

public class connectionInvocationtracker  implements InvocationHandler{
	Connection connection;
	public connectionInvocationtracker(Connection returnvalue) {
		this.connection=connection;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("method name "+method.toGenericString());
		Object returnvalue=method.invoke(connection, args);
		return returnvalue;
	}

}
