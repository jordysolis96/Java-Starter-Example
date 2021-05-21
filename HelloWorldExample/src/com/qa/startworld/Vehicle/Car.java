package com.qa.startworld.Vehicle;

import com.qa.startworld.Vehicle.vehicle.Vehicle;

public class Car extends Vehicle{

	
	private String color;
	private int year;
	
	public Car(String make, String model, int year, String color) {
		super(make, model);
		this.color = color;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;

	}
	
}