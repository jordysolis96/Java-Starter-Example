package com.qa.startworld.Vehicle;

import com.qa.startworld.Vehicle.vehicle.Vehicle;

public class Motorcycle extends Vehicle{

		private String color;
		private int year;
		private Boolean sports;
		private Boolean dirt;

		
		public Motorcycle(String make, String model, int year, String color, Boolean sports, Boolean dirt) {
			super(make, model);
			this.color = color;
			this.year = year;
			this.sports = sports;
			this.dirt = dirt;
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
		
		public Boolean getSports() {
			return sports;
		}
		
		public void setSPorts(Boolean sports) {
			this.sports = sports;

		}
		
		
		public Boolean getDirt() {
			return dirt;
		}
		
		public void setDirt(Boolean dirt) {
			this.dirt = dirt;

		}
}

