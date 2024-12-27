package factory_method;

public class printable_Factory {

//	A static factory method that returns instance of another class. 
	public static printable getprintable() {
		 //return new B();  
		System.out.println("getprintable called..");
        return new A();//return any one instance, either A or B  
	}
	
//	A static factory method that returns instance of another class. 
	public static printable getprintable2() {
		System.out.println("getprintable2 called..");
		 return new B();  //return any one instance, either A or B  
	}
	
//	A non-static factory method that returns instance of another class.
	public  printable getprintable3() {
		System.out.println("non static getprintable-3 called..");
		 return new B();  //return any one instance, either A or B  
	}
}
