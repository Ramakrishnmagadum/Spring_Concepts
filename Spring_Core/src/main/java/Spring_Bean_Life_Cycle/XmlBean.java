package Spring_Bean_Life_Cycle;

public class XmlBean {
	String name;
	int num;

	public void setName(String name) {
		System.out.println("Setname method called");
		this.name = name;
	}

	public void setNum(int num) {
		System.out.println("Set num method called");
		this.num = num;
	}

	@Override
	public String toString() {
		return "XmlBean [name=" + name + ", num=" + num + "]";
	}

	//this mehtod will act as Init Method (Why beacuse this method mentioned as init_method="start")....method name we can give anything but siganature should be same...
	public void start() {
		System.out.println("init method called");
	}

	//for this shutdownhook needs to enable 
	//this mehtod will act as destory Method (Why beacuse this method mentioned as destory_method="destory")....method name we can give anything but siganature should be same...
	public void end() {
		System.out.println("end method called");
	}

}
