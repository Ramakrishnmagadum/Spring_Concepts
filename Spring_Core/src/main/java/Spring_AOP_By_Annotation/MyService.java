package Spring_AOP_By_Annotation;

public class MyService {
	public void method1() {
		System.out.println("My  Method1");
	}
	
	public void getmethod1() {
		System.out.println("My getmethod1 Method");
	}
	
	public void getmethod2(String name) {
		System.out.println("My getMethod2 with argument "+name);
	}
	
	public void method1(String name) {
		System.out.println("My method1 with argument "+ name);
	}
}
