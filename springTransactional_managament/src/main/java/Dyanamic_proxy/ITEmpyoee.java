package Dyanamic_proxy;

public class ITEmpyoee implements IEmplyoee{

	private double salary;
	private String name;
	private int id;
	
	@Override
	public void giveHike(double amount) {
		this.salary=this.salary+amount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void paycut(double amount) {
		// TODO Auto-generated method stub
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
