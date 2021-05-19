package com.qa.startworld;

public class Constructor {
	

	public class Person {
	
		
		public String name; //
		public int age; //
		public String gender; //
		public boolean isBreathing;
		public int walkSpeed = 30; // in feet
		public String title = "Milo the pug";
		public String author = "Marina vape";
		public int pages = 10;
		public String genre = "Comedy";
		
		// Constructor
		public Person(String name, int age, String gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		
		public void read() {
			System.out.println(this.name + " is reading the book titled: {given}" + this.title);
		}
		
		public boolean isStillBreathing() {
			return isBreathing;
		}
		
		public String speak(String msg) {
			return this.name + " says: " + msg;
		}
		
		public int walk() {
			return walkSpeed;
		}
		
		public void book(String title, String author, int pages, String genre) {
			this.title = title;
			this.author = author;
			this.pages = pages;
			this.genre = genre;
		}
	}

	
}
