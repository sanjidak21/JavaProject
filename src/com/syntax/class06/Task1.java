package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		String message;
		System.out.println("Enter grade please");
		
		Scanner scanner = new Scanner(System.in);
		char grade = scanner.next().charAt(0);
		
		switch (grade) {
		
		case ('A'):
			message = "A - Excellent";
			break;
			
		case ('B'):
			message = "B - Good";
			break;
			
		case ('C'):
			message = "C - Average";
			break;
			
		case ('D'):
			message = "D - Bad";
			break;
		default :
			message = "Not Acceptable";
			
		}
		
		System.out.println(message);
	}
				
			

}
