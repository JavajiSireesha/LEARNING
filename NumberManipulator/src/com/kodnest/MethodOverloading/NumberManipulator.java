package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class NumberManipulator {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		NumberManipulator manipulator = new NumberManipulator();
        System.out.println("Enter The Values");
        int num1 = scan.nextInt();
        double num2 = scan.nextDouble();
        System.out.println("Square of integer  : "  + manipulator.square(num1));
        System.out.println("Square of double : " + manipulator.square(num2));
	}
	
	
	// Calculate the square of an integer
    public int square(int num)
    {
        return num * num;
    }

    // Calculate the square of a double
    public double square(double num)
    {
        return num * num;
	
    }
	

}
