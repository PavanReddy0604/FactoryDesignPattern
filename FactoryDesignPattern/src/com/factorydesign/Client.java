package com.factorydesign;

public class Client {

	public static void main(String[] args) {
		try {
		Employee emp=Factory.getEmployee("MLEngineer   ");
		System.out.println(emp.salary());
		}
		catch(IllegalArgumentException e) {
			System.out.println("employee not found");
		}
		
	}

}
