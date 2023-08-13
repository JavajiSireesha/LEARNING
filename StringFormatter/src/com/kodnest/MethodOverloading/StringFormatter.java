package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class StringFormatter {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values");
		System.out.println("Enter integer value : ");
		int num1 = scan.nextInt() ;
		System.out.println("Enter double value : ");
		double num2 = scan.nextDouble();
		System.out.println("Enter String value : ");
		String str = scan.next(); 
		System.out.println(format( num1) );
        System.out.println(format( num2) );
        System.out.println(format(str) );
	}
	
	
	//Format integers
	public static String format(int number) 
	{
		return "Formatted : " + number;
	}
	
	//Format doubles
	public static String format(double number) 
	{
		return "Formatted : " + number;
	}
	
	//Format strings
	public static String format(String text) 
	{
		return "Formatted : " + text;
	}

}
