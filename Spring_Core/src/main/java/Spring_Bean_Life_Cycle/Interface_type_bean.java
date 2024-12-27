package Spring_Bean_Life_Cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//InitializingBean interface for init method 
//DisposableBean interface for destory method...
public class Interface_type_bean  implements InitializingBean , DisposableBean{
	String name;
	int age;

	public void setName(String name) {
		System.out.println("interface setname method");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("interface setage method...");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Interface_type_bean [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method called");	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method called");
	}

}
