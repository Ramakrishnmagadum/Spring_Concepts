package ConstructorInjection;

import java.util.Map;

public class Map_Bean {
	String name;
	Map<Integer, String> map;
	public Map_Bean(String name, Map<Integer, String> map) {
		super();
		this.name = name;
		this.map = map;
	}
	@Override
	public String toString() {
		return "Map_Bean [name=" + name + ", map=" + map + "]";
	}
	

}
