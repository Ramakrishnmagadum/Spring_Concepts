package Spring_AOP_By_Annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Phonepay {
	
//	@Before("execution(* MyService.method1())")
//	public void phonePayMethod() {
//		System.out.println("before Method");
//	}
//	
//	@After("execution(* MyService.method1())")
//	public void phonePayMethod_after() {
//		System.out.println("after  Method");
//	}
//	
//	@AfterReturning("execution(* MyService.method1())")
//	public void phonepayMethod_Afterreturn()
//	{
//		System.out.println("After return Method");
//	}
//	
//	@AfterThrowing("execution(* MyService.method1())")
//	public void phonepayMethod_AfterThrowing()
//	{
//		System.out.println("After throwing Method");
//	}
//	
//	@Around("execution(* MyService.method1())")
//	public void phonepayMethod_Around(ProceedingJoinPoint joinPoint ) throws Throwable
//	{
//		System.out.println("before Around Method");
//		Object obj=joinPoint.proceed();
//		System.out.println("after Around Method");
//	}
	
//	---only change in pointcut expression----
	
//	@Before("execution(* MyService.method1(..))")   //it will call before method1 with and without arguments...
//	public void phonePayMethod() {
//		System.out.println("before Method");
//	}
	
//	--this will call for every methods including any parameter passing--
//	@Before("execution(* MyService.*(..))")
//	public void phonePayMethod() {
//		System.out.println("before Method");
//	}
	
//	--this will call when method name start withe get ---
//	@Before("execution(* MyService.get*(..))")
//	public void phonePayMethod() {
//		System.out.println("before Method");
//	}
	
//	--this will call when method start with get and it should return the string ---
//	@Before("execution(String MyService.get*(..))")
//	public void phonePayMethod() {
//		System.out.println("before Method");
//	}
	
	
//	--this method will when inside thise bean if any methods are calling--
	@Before("bean(myService)")
	public void phonePayMethod() {
		System.out.println("before Method");
	}
}
