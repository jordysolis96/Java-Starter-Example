package com.qa.startworld;

public class Constructor {
	
	public static void main(String[] args) {
		

	}

	public static class Person {
	
				
		public static String name; //
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
		
	
	}
	
//	public class Book {
//	    
//	    // Attributes
//	    public String title;
//	    public String author;
//	    public String genre;
//	    public String edition;
//	    public int pageCount;
//	    public boolean isOpen;
//	    
//	    // Constructor
//	    public Book(String title, int pageCount, String edition) {
//	        this.title = title;
//	        this.pageCount = pageCount;
//	        this.edition = edition;
//	    }
//	    
//	    // Methods
//	    public void open() {
//	        this.isOpen = true;
//	    }
//	    
//	    public void close() {
//	        this.isOpen = false;
//	    }
//	    
//	    public String getTitle() {
//			return title;
//		}
//
//		public void setTitle(String title) {
//			this.title = title;
//		}
//
//		public String getEdition() {
//			return edition;
//		}
//		
//		public void setEdition(String edition) {
//			this.edition = edition;
//		}
//
//		public int getPageCount() {
//			return pageCount;
//		}
//
//		public void setPageCount(int pageCount) {
//			this.pageCount = pageCount;
//		}
//	    
//	    
//	}

	
}
