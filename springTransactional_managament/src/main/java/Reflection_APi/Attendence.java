package Reflection_APi;

import java.util.Date;

public class Attendence {
	private String name;
	private boolean ispresent;

	Attendence(String name, boolean ispresent) {
		super();
		this.name = name;
		this.ispresent = ispresent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIspresent() {
		return ispresent;
	}

	public void setIspresent(boolean ispresent) {
		this.ispresent = ispresent;
	}
}
