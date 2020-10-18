package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// I want to say Good morning 5 times;
		
		/*
		 * For Syntax 
		 * 
		 * for (initialization; condition; increment/decrement){
		 * 		code;
		 */
		
		for (int i=1; i<=10; i++) {
				
			System.out.println("Good Morning");
			
		}
		
		//I want to print number 1 to 100
		
		/* For Syntax
		 * 
		 * for (start point; end point; increment/decrement) {
		 * }
		 */
		
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
           System.out.println("-----------------------");
           
           for(int i=10; i>0; i--) {
        	   System.out.println(i+" ");
        	   
           }
           
           System.out.println("----------- What will be output?----------");
           
           for(int i=0; i<=30; i+=3) {
        	   System.out.println(i+" ");
        	   
           }
		
	}

}
