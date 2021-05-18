package com.qa.startworld;

public class Runner {
	public static void main(String[] arg) {
		System.out.print(Calculator.add(2, 4));
		Runner.FizzBuzz();
		
		int[] array = new int[10];
		System.out.println(array);
	}
	
	
	public static void populateArray() {
	System.out.println("Starting task");
	
	int [] array = new int[10]; 
		
	for(int x = 0; x < array.length; x++) {
		array[x] = x + 1;
		System.out.print(array[x] + " ");
	}
	
	System.out.print("");
	
	for(int x = 0; x < array.length; x ++) {
		array[x] *= 10;
		System.out.print(array[x] + " ");
	}
}

	
	public static int Flowcharts(int num, int num2, boolean bool) {
		if(bool == true) {
			return num + num2;
		}else {
			return num * num2;
		}
	}
	
	public static void Flowchart(int A) {
		if(A > 2000) {
			System.out.println("A");
			if(A > 6000) {
				System.out.println("C");
				return;
			}else if(A < 6000) {
				System.out.println("B");
				if(A > 4000) {
					System.out.println("D");
					return;
				}else if(A < 4000) {
					System.out.println("E");
					return;
				}
			}
		}else if(A < 2000) {
			System.out.println("1");
			if(A < 100) {
				System.out.println("2");
				System.out.println("End");
				return;
			}else if(A > 100) {
				System.out.println("3");
				if(A > 600) {
					System.out.println("5");
				}else if(A < 600) {
					System.out.println("4");
					if(A > 500) {
						System.out.println("6");
					}else {
						System.out.println("7");
						return;
					}
				}
			}
		}
	}
	
	public static int UniqueSum(int one, int two, int three) {
		if(one == two) {
			return one + three;
		}else if(one == three){
			return one + two;
		}else {
			return one + two + three;
		}
	}
	
	public static void FizzBuzz(){
		int i = 0;
		for(i = 0; i <= 100; i++) {
			if(i % 3 == 0 && i % 5== 0) {
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i  % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
	
	
	
}
