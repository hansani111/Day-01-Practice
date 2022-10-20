package com.bl.day01.practice;

public class StaticExample {
	
	static int var1;
	static String str1;
	
	static void display() {
		var1 = 1;
		str1 = "hansani";
		
		System.out.println("var1 is = " +var1);
		System.out.println("str1 is = " +str1);
	}

	public static void main(String[] args) {
		display();

	}

}
