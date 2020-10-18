package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * lets ask a tester on which browser they would like to use 
		 * 
		 * 
		 */
		
		Scanner scan;
		String browser;
		String message;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter browser");
		browser = scan.nextLine();
		
		switch(browser.toLowerCase()) {
		
		case "safari":
			message="your code will be executed on safari browser";
			break;
		case "chrome":
		message="your code will be executed on safari browser";
		break;
		case "firefox":
		message="your code will be executed on safari browser";
		break;
		default:
			message = "entered browser is not supported";
		}
		
		System.out.println(message);
		
		//switch cannot work with double, flost, long 
		//switch case cannot use relational 
		
		float f=10.99f;
		double d=19.90;
		long l=19099;
		boolean b=true;
		
		
//		switch(l) { CE:Cannot switch on a value of type long.
//		}
//		
		
	
		
	}

}
