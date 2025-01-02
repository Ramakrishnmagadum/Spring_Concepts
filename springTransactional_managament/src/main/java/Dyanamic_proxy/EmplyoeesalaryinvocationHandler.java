package Dyanamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmplyoeesalaryinvocationHandler  implements InvocationHandler{
	ITEmpyoee itEmpyoee;
	public EmplyoeesalaryinvocationHandler(ITEmpyoee itEmpyoee) {
		this.itEmpyoee=itEmpyoee;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	   //pre processing
		if(method.getName().equals("giveHike")) {
			double  hikevalue=(double) args[0];
			if(hikevalue<=0) {
				throw new RuntimeException("hike amount is not valid");
			}
		}
		
		//actual logic
		
		Object returnvalue=method.invoke(itEmpyoee, args);
		//post processing
		
		System.out.println("executing method :"+ method.getName()+" for ecample id :"+ itEmpyoee.getId());
		
		return returnvalue;
	}

}
