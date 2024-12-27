package ConstructorInjection;

import java.util.Set;

public class Set_Bean {
	int value;
	Set<Integer> set;
	public Set_Bean(int value, Set<Integer> set) {
		super();
		this.value = value;
		this.set = set;
	}
	@Override
	public String toString() {
		return "Set_Bean [value=" + value + ", set=" + set + "]";
	}
}
