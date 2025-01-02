package Dyanamic_proxy;

import java.lang.reflect.Proxy;

public class client {
public static void main(String[] args) {
	ITEmpyoee itEmpyoee=new ITEmpyoee();
	itEmpyoee.setId(101);
	itEmpyoee.setName("ramakrishna");
	itEmpyoee.setSalary(30000);
	
	EmplyoeesalaryinvocationHandler handler=new EmplyoeesalaryinvocationHandler(itEmpyoee);
	
	IEmplyoee emplyoee= (IEmplyoee) Proxy.newProxyInstance(ITEmpyoee.class.getClassLoader(), new Class[] {IEmplyoee.class}, handler);
	emplyoee.giveHike(-2000);
	System.out.println(emplyoee.getSalary());
}
}
