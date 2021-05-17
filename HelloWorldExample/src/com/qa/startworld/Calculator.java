package com.qa.startworld;

public class Calculator {
	public static int add(int num, int num2) {
		if(num > num2) {
			System.out.print("first intput# should be greater than input#");
			return 0;
		}else {
			return num + num2;
		}
	}
	
	public static int Multiplication(int num, int num2) {
		return num * num2;
	}
	
	public static int Subtraction(int num, int num2) {
		return num - num2;
	}
	
	public static Double Divsion(Double num, Double num2) {
		return num / num2;
	}
}
