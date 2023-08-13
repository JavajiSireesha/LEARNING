package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Values");
		double celsius = scan.nextDouble();
		int fahrenheit = scan.nextInt();
		System.out.println("Celsius to Fahrenheit : " + convertTemperature(celsius) );
		System.out.println("Fahrenheit to Celsius : " + convertTemperature(fahrenheit) );
        
	}

	// Convert Celsius to Fahrenheit
	
    public static double convertTemperature(double celsius) 
    {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    
    public static double convertTemperature(int fahrenheit) 
    {
        return (fahrenheit - 32) * 5 / 9;
    }
	
	
}
