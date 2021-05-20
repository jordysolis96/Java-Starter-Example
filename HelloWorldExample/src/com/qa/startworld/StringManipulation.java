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
	
	public static String PrintVerticle(String str) {
		if(str.length() > 0) {
			for(int i = 0; i < str.length(); i++) {
				if(str.substring(i, i+1).equals(" ")) {
					System.out.println();
					i+=1;
				}
				System.out.print(str.substring(i, i+1));
			}			
		}
		return "";
	}
	
	public static String ReverseVertical(String str) {
		int Count = str.length();
		
		if(str.length() > 0) {
			for(int i = str.length()-1; i >= 0; i--) {
				if(str.substring(i, i+1).equals(" ") || i == 0) {
					if(i == 0) {
						System.out.println(str.substring(i, Count));
					}else {
						System.out.println(str.substring(i+1, Count));						
					}
					Count = i;
				}
			}			
		}
		return "";
	}
	
	
}
