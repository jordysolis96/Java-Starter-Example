package com.qa.startworld.Garage;
	
	import java.util.ArrayList;
	import java.util.List;

import com.qa.startworld.Garage.vehicle.Vehicle;

	public class Garage{

		private static List<Vehicle> Garage = new ArrayList<>();

		public Garage() {}
		
		//CRUD
		public static String add(Vehicle v) {
				Garage.add((Vehicle) v);
				return "This Vehicle was added to your garage";
		}
		
		public static String emptyGarage() {
			Garage.clear();
			return "Your garage has been cleared";
		}
		
		public static String removeByMake(String make) {
			for(int i = 0; i < Garage.size(); i++) {
				if(Garage.get(i).getMake() == make) {
					Garage.remove(i);
					return make + " removed";
				}
			}
			return "There is no vehicle with relating to this make...";
		}
		
		public static String removeByModel(String model) {
			for(int i = 0; i < Garage.size(); i++) {
				if(Garage.get(i).getModel() == model) {
					Garage.remove(i);
					return model + " removed";
				}
			}
			return "There is no vehicle with relating to this model...";
		}
		
		public static String removeById(int id) {
			for(int i = 0; i < Garage.size(); i++) {
				if(Garage.get(i).getId() == id) {
					Garage.remove(i);
					return id + " removed";
				}
			}
			return "There is no vehicle with relating to this id...";
		}

		
		public List<Vehicle> displayVehicles() {
			return Garage;
		}
		
		
		//fix Vehicle (Calculate bill)
		public static String fixVehicle() {
			
			String vehicles = "";
			double bill = 0;
			
			for(int i = 0; i < Garage.size(); i++) {
				if(Garage.get(i) instanceof Car) {
					bill = 5000;
					vehicles += Garage.get(i) + "\n";
					vehicles += "Repairs where: $" + bill + "\n";
				}else if(Garage.get(i) instanceof Motorcycle) {
					bill = 3500;
					vehicles += Garage.get(i) + "\n";
					vehicles += "Repairs where: $" + bill + "\n";
				}else if(Garage.get(i) instanceof Truck) {
					bill = 7500;
					vehicles += Garage.get(i) + "\n";
					vehicles += "Repairs where: $" + bill + "\n";
				}
				
			}
			
			return vehicles;
		}

}