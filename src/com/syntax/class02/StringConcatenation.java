package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Olga";
		
		//I would like to say : My name is Olga
		
		System.out.println("My name is "+name);
		
		String lastName="Sorrels";
		//I would like to print Olga Sorrels 
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		//Olga lives in Miami
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//Olga is a B student 
		System.out.println(name+" is "+grade+" student");
		
		int age=21;
		//Olga is 21 years old
		System.out.println(name+" is "+age+" years old");
		/*
		 to attach/concatenate ANY value (char, int, String, double)
         to a String we use + (String Concatenation operator)
         */
		
		int          date=       27;
		String month="September";
		System.out.println(date+" "+month);
		
		String state="DC";
		String anotherState="  DC";
		//above String are not equal, 
		//state has 2 characters and anotherState has 2 characters
		System.out.println(state);
		System.out.println(anotherState);
		
         
		
		
		
		

	}

}
