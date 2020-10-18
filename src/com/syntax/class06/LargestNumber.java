package com.syntax.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double num1, num2, num3, max;
		System.out.println("Please enter numbers");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		scanner.close();
		// 1st way
		
		if (!(num1==num2 && num2==3)) {
		
		if (num1 > num2 && num1 > num3) {
			max =num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println(max);
		
		} else {
			System.out.println("Number are equal");
			System.out.println("largest value is "+num1);
		}
		
		System.out.println("-----------------------------------");
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("Number are equal");
			
		} else {
			
			
				
			}
		
			
		
		
	
		
		
			
			
			
			
			
			
			
			double biggest;
		
		System.out.println(" ------   Comparing 2 numbers using nested if ------ ");
		// 2nd way
		
				if (num1>num2 ) { //if  number 1 large than number 2
					if (num1>num3) {
						biggest=num1;
					}else {
						biggest=num3;
					}
				} else {// number 2 is larger than number 1
					
					if (num2 > num3) {
						biggest = num2;
					} else {
						biggest = num3;
					}
				}
				
				System.out.println("the largest number is " + biggest);
				
						
		
				
		}
}
