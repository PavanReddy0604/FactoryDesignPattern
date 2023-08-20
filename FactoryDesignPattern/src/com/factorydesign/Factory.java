package com.factorydesign;

public class Factory {

	public static Employee getEmployee(String employee) {
		employee=employee.trim();
		switch (employee) {
		case "MLEngineer":
			return new MLEngineer();
		case "WebDeveloper":
			return new WebDeveloper();
		case "AndroidDeveloper":
			return new AndroidDevloper();
		default:
			throw new IllegalArgumentException("employee not found");
		}
	}

}
