package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class SimpleOverloading {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    SimpleOverloading simple = new SimpleOverloading();
        System.out.println("Enter The integer type of Values");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Sum of Integers : " + simple.add(num1 ,num2));
        System.out.println("Enter The double type of values ");
	    double a = scan.nextDouble();
	    double b = scan.nextDouble();
	    System.out.println("Sum of doubles : " + simple.add(a ,b));
	    System.out.println("Enter Two Strings");
	    String str1 = scan.next();
	    String str2 = scan.next();
	    System.out.println("Concatenated String : " + simple.add(str1,str2));
	}
	
	
	// Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    

}
