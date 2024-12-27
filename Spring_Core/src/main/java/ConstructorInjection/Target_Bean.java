package ConstructorInjection;

public class Target_Bean {
	String name;
	int num;
	Depedent_Bean depedent;
	public Target_Bean(String name) {
		super();
		this.name = name;
	}
	public Target_Bean(String name, int num, Depedent_Bean depedent) {
		super();
		this.name = name;
		this.num = num;
		this.depedent = depedent;
	}
	public Target_Bean(Depedent_Bean depedent) {
		super();
		this.depedent = depedent;
	}
	@Override
	public String toString() {
		return "Target_Bean [name=" + name + ", num=" + num + ", depedent=" + depedent + "]";
	}
}
