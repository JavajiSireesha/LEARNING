package com.kodnest.MethodOverloading;

public class Greet
{
    //Greet a person
	public static void greet(String name) 
	
	{
		System.out.println("Hello, " + name + "!");
	}
	
	//Greet a person with a specific greeting
		public static void greet(String name , String greeting) 
		
		{
			System.out.println(greeting + " , " + name + "!");
		}
	
}
