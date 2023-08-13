package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class NumberOperations {

	public static void main(String[] args) 
	{
	   Scanner scan = new Scanner(System.in);
	   Operations operations = new Operations(); 
       System.out.println("Enter values to check if a number is even");
       int num1 = scan.nextInt();
       double num2 = scan.nextDouble();
       System.out.println(operations.isEven( num1));
       System.out.println(operations.isEven(num2));
	}

	

}
