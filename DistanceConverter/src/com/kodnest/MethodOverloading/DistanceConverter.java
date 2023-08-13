package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class DistanceConverter {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		DistanceConverter convert = new DistanceConverter();
		System.out.println("Enter The Values ");
		double kilometers = scan.nextDouble();
		double miles = scan.nextDouble();
		System.out.println("10 kilometers in miles : "+ convert.convertToMiles( kilometers));
		System.out.println("10 kilometers in kilometers : " +convert.convertToMiles(miles) );

	}
	

		
		// Convert kilometers to miles
	    public double convertToMiles(double kilometers)
	    {
	        return kilometers * 0.9371;
	    }

	    // Convert miles to kilometers
	    public double convertToKilometers(double miles)
	    {
	        return miles / 0.1371;
	    }

		
	}

