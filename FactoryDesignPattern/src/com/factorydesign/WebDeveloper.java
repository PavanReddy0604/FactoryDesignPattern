package com.factorydesign;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("web developer salary");
		return 100;
	}

}
