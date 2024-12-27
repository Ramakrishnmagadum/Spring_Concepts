package ConstructorInjection;

import java.util.List;

public class List_Bean {
int num;
List<String> list;
public List_Bean(int num, List<String> list) {
	super();
	this.num = num;
	this.list = list;
}
@Override
public String toString() {
	return "List_Bean num=" + num + ", list=" + list ;
}

}
