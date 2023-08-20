package com.factorydesign;

public class MLEngineer implements Employee {

	@Override
	public int salary() {
		System.out.println("ML Enginner salary");
		return 300;
	}

}
