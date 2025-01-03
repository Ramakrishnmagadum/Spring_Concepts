package Reflection_APi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class Teacher {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {
		Class<Student_proxy> object = (Class<Student_proxy>) Class.forName("Reflection_APi.Student_proxy");
		// this method will give public and private both type methods only from this
		// class...
//		Method[] method = object.getDeclaredMethods();
//		for (Method m : method) {
//			System.out.println(m.getName());
//		}

		// this method will give only public methods from super class including this
		// class too...
//		Method[] methods = object.getMethods();
//		for (Method m : methods) {
//			System.out.println(m.getName());
//		}

		Field[] fields = object.getFields();
		for (Field m : fields) {
			System.out.println(m.getName());
		}

		// it will list constructers
//		Constructor<Student_proxy>[] constr = (Constructor<Student_proxy>[]) object.getDeclaredConstructors();
//		for (Constructor m : constr) {
//			System.out.println(m.getName());
//		}

		
		//---------------    calling the metthods by reflection API  -------------------------------
		
		//it will create new object 
		Student_proxy newobject = (Student_proxy) object.newInstance();
		//newobject.attendlession(1);  //directly also we can call the method ....by passing the arguments
		//here we are passing the arguments
		Class[] args1=new Class[] {Integer.class};
		//here passing the method name and arguments
		Method methodname = object.getDeclaredMethod("attendlession", args1);
		//invoking the method
		methodname.invoke(newobject, 1);
		
	    //calling method with 3 parameter
		Class[] args3=new Class[] {Integer.class,String.class,String.class};
		Method methodname3 = object.getDeclaredMethod("attendlession", args3);
		methodname3.invoke(newobject, 12,"ramakrishna","magadum");
		
		System.out.println("End of Program");
	}
}
