package com.syntax.class07;

import java.util.Scanner;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for your water");
		money=input.nextInt();
		
		do {
			if (money>waterPrice) {
				System.out.println("This is too much");
			}else if (money<waterPrice) {
				System.out.println("Water is expensive, insert more money");
			}
			
			
			//money=input.nextInt();
			
		}while(money!=waterPrice);
		
		System.out.println("Enjot your water");
			
		}

   }
	
	
