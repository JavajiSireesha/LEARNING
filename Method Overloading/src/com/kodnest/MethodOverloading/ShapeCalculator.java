package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class ShapeCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Values");
        double num1 =scan.nextDouble();
        double num2 =scan.nextDouble();
        double num3 =scan.nextDouble();
        System.out.println("Area of Rectagle : " + calculate( num1 ,  num2)  );
        System.out.println("Area of Circle : " +calculate(num1 ,num2 , num3) );
        System.out.println("Volume of Box : " + calculate(num1) );
	    System.out.println("Volume of Sphere : " + calculateVolume(num1) );
        
        
        
	}
	
	//Calculate the area of a rectangle
	public static double calculate(double length , double width) 
	{
		return length * width;
	}
	
	// Calculate the area of a circle
	
	public static double calculate(double radius) 
	{
		return Math.PI * radius * radius;
    
	}

	//Calculate the volume of a box
	
	public static double calculate(double length , double width , double height) 
	{
		return length * width * height;
	}
	
	//Calculate the volume of a sphere
	public static double calculateVolume(double radius)
	{
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
	
	
	
}
