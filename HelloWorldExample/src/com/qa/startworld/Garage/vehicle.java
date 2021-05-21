package com.qa.startworld.Garage;

public class vehicle {
	
	public static class Vehicle{
		
		private String make;
		private String model;
		private int id;
	
		
		public Vehicle(String make, String model, int id) {
			this.make = make;
			this.model = model;
			this.id = id;
		}
		

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}

	}


}
