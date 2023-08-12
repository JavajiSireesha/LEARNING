package com.kodnest.MethodsWithOperators;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int first = scan.nextInt();
		System.out.println("Enter the second integer");
		int second = scan.nextInt();
		swapUsingBitwise(first , second);
		
		System.out.println("After swapping: First = " + first + " , Second = " + second);
	}

	
	public static void swapUsingBitwise(int a ,int b) 
	
	{
		a = a ^ b;
        b = a ^ b;
        a = a ^ b;
	}
}