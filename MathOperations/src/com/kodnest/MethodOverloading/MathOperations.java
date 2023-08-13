package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integer Values to perform math operations");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println("Sum of Two Integers : " + Math.add(num1 , num2));
        System.out.println("Sum of Three Integers : "+ Math.add(num1 , num2 ,num3));
        System.out.println("Enter double values to perform math operations");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println("Sum of Two doubles : " + Math.add(a , b));
        System.out.println("Sum of Three doubles  : "+ Math.add(a , b , c));
        
	}

}
