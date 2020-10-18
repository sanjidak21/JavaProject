package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isSale = true; 
		double price = 150;
		
		if (isSale) {
		System.out.println("Let's go shopping");
		System.out.println("The original price is " + price);
		
		if (price > 50) {
			price = price * .9;
			System.out.println("The price after discount is " + price);
		}else if (price > 50 && price < 101) {
			price = price * .8;
			System.out.println("The price after discount is " + price);
		} else if (price > 100 && price <= 500) {
			price = price * .6;
			System.out.println("The price after is discount is " + price);
		} else if (price > 500) {
			price = price * .5;
			System.out.println("The price after discount is " + price);
		}
		
		} else {
			
			
		}
			
			
		}
			
		
		

	}


