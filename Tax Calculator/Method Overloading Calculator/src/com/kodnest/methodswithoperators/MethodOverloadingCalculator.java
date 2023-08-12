package com.kodnest.methodswithoperators;

import java.util.Scanner;

public class MethodOverloadingCalculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number ");
		double num2 = scan.nextDouble();
		System.out.println("Enter the operator");
        char operator = scan.next().charAt(0);
        System.err.println("Result " + calculateApp(num1 , num2 , operator));
	}

	public static double calculateApp(double num1 , double num2 , char operator)
	{                                            
	  switch (operator) 
	  {
	  case '+':
		 return calculateAdd(num1 , num2);
		 
	  case '-':
		 return calculateSub(num1 , num2);
		 
	  case '*':
		 return calculateMul(num1 , num2);
	
	  case '/':
		 return calculateDiv(num1 , num2);
		default: 
		 System.out.println("invalid operator");
		 return Double.NaN;
		 
	  } 
	}	
		 
	 
	 public static double calculateAdd(double a, double b)
	    {
	    	return a+b;
	    }

	    public static double calculateSub(double a, double b)
	    {
	    	return a-b;
	    }

	    public static double calculateMul(double a, double b)
	    {
	    	return a*b;
	    }

	    public static double calculateDiv(double a, double b)
	    {
	    	return a/b;
	    }
	    
		 
	 
}	 
		 
  
		 
		 
	
	
	
	

