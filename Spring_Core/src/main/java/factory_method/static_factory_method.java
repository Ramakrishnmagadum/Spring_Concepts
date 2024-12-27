package factory_method;

public class static_factory_method {

	public final static  static_factory_method obj = new static_factory_method();
	
	
	private static_factory_method() {
		super();
		System.out.println("private constructor..");
	}

	public static static_factory_method getmethod() {
		System.out.println("factory method..");
		return obj;
	}
	
	
	
	public void msg()
	{
		System.out.println("meesage method..printing..");
	}
}
