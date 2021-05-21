package com.qa.startworld;

import com.qa.startworld.Constructor.Person;

public class Employee extends Person{
	
	private double annualSalary;
	private double weeklySalary;
	
	public Employee(String name, double annualSalary, int age, String gender) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
		this.weeklySalary = calculateWeeklySalary();
		
	}
	
	public double calculateWeeklySalary() {
		return this.annualSalary/52;
	}
	
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
}
