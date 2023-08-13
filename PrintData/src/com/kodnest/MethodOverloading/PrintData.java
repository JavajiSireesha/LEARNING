package com.kodnest.MethodOverloading;

public class PrintData {

	 //Print an integer
	public void print(int num)
	{
		System.out.println("Printing integer : " + num);
	}
	

	//Print a double
	public void print(double num)
	{
		System.out.println("Printing double : " + num);
	}
	
	//Print a string
	public void print(String text)
	{
		System.out.println("Printing string : " + text);
		
	}
	
}
