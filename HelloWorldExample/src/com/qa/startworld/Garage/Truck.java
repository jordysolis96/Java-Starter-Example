package com.qa.startworld.Garage;

import com.qa.startworld.Garage.vehicle.Vehicle;

public class Truck extends Vehicle{


		
		private String color;
		private int year;
		private Boolean camper;
		
		public Truck(String make, String model, int year, String color, Boolean camper) {
			super(make, model);
			this.color = color;
			this.year = year;
			this.camper = camper;
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
		
		public Boolean getCamper() {
			return camper;
		}
		
		public void setColor(Boolean camper) {
			this.camper = camper;

		}
		
}
