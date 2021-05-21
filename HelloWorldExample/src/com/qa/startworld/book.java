package com.qa.startworld;

public class book {
	
public class Book {
	    
	    // Attributes
	    public String title;
	    public String author;
	    public String genre;
	    public String edition;
	    public int pageCount;
	    public boolean isOpen;
	    
	    // Constructor
	    public Book(String title, int pageCount, String edition) {
	        this.title = title;
	        this.pageCount = pageCount;
	        this.edition = edition;
	    }
	    
	    // Methods
	    public void open() {
	        this.isOpen = true;
	    }
	    
	    public void close() {
	        this.isOpen = false;
	    }
	    
	    public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getEdition() {
			return edition;
		}
		
		public void setEdition(String edition) {
			this.edition = edition;
		}

		public int getPageCount() {
			return pageCount;
		}

		public void setPageCount(int pageCount) {
			this.pageCount = pageCount;
		}
	    
	    
	}

}
