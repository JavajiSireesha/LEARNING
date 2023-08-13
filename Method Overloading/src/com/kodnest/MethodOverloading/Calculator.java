package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter The Values");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        System.out.println("Sum of Three Integers : " + add ( num1 , num2 ,num3));
        System.out.println("Sum of Two Integers : " +add ( num1 , num2));
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Sum of Two Doubles : "+ add (a,b));
        String str1=scan.next();
        String str2=scan.next();
        System.out.println("Concatenated String : "+ add(str1 ,str2));
       
	}
	
	//Method to Add Two Integers
	public static int add (int num1 ,int num2)
	{
		return num1+num2;
	}
	
	//Method to Add Three Integers
	public static int add(int num1, int num2 ,int num3)
	{
		return  num1+num2+num3;
	}
	
	//Method to Add Two doubles
	public static double add(double a , double b) 
	{
		return a+b;
	}
	
	//Method to Concatenate Two Strings
	public static String add(String str1, String str2)
	{
		return str1+str2;
	}
   
}
