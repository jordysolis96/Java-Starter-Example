package com.qa.startworld;

public class StringManipulation {
	
	public static void main(String[] arg) {
		
		String rainy = "Yesterday it was raining ";
		String sunny = "today it is sunny";
		
		System.out.println(rainy.toUpperCase() + sunny.toUpperCase());
		System.out.println(sunny.substring(0, 11).toUpperCase() + " " + rainy.substring(17).toUpperCase());
		
		System.out.println(StrCounter("Hello this is a string"));
	}
	
	public static int StrCounter(String input) {
		if (input == null || input.isEmpty()) {
			System.out.print("0");
		}
		
		String[] words = input.split("\\s+");
		return words.length;
	}
	
	
}
