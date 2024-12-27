package ConstructorInjection;

public class primitive_Bean {

	int num;
	boolean flag;
	String name;
	public primitive_Bean(int num) {
		super();
		this.num = num;
	}
	
	public primitive_Bean(boolean flag) {
		super();
		this.flag = flag;
	}

	public primitive_Bean(String name) {
		super();
		this.name = name;
	}

	public primitive_Bean(int num, boolean flag, String name) {
		super();
		this.num = num;
		this.flag = flag;
		this.name = name;
	}

	@Override
	public String toString() {
		return "primitive_Bean num=" + num + ", flag=" + flag + ", name=" + name ;
	}
	
}
