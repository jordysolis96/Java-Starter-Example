package com.qa.startworld;

import com.qa.startworld.javabasics.array.Grind;

public class Results {
	
	public static double Physics = 130;
	public static double Chemistry = 100;
	public static double Biology = 112;
	public static double total = Physics + Chemistry + Biology;
	public static double percentage;
	
	public static void displayResults() {
		System.out.println("Physics Marks: " + Physics);
		System.out.println("Chemistry Marks: " + Chemistry);
		System.out.println("Biology Marks: " + Biology);
		System.out.println("total Marks: " + total);
	
			
	public static double ExamOverall() {
	
		return percentage = total * 100 / 450;
	}
	

}
