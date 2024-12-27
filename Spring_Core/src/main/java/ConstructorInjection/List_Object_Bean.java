package ConstructorInjection;

import java.util.List;

public class List_Object_Bean {
	int num;
	List<List_Bean> list;

	public List_Object_Bean(int num, List<List_Bean> list) {
		super();
		this.num = num;
		this.list = list;
	}

	@Override
	public String toString() {
		return "List_Object_Bean [num=" + num + ", list=" + list + "]";
	}
}
