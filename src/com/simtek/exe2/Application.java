package com.simtek.exe2;

import java.util.Scanner;

public class Application {

	// Read in a line of code from the console
	// catagorize if string short, medium or long
	// short < 5, medium < 11, long greater then or equal 11
	// print the result
	public static void main(String[] args) {
		System.out.println("Enter a string!");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String lenCat = null;
		
		if (str.length() < 5 && !str.isEmpty()) {
			lenCat = "short";
		} else if (str.length() >= 5 && str.length() < 11) {
			lenCat = "medium";
		} else if (str.length() >= 11) {
			lenCat = "long";
		} else {
			lenCat = "empty";
		}
		
		System.out.println("The lenCat is: " + lenCat );

	}

}
