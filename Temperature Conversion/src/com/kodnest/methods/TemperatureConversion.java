package com.kodnest.methods;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Fahrenheit Temperature");
        double fahrenheit=scan.nextDouble();
        System.out.println(fahrenheitToCelsius( fahrenheit));
        System.out.println("Enter Celsius Temperature");
        double celsius=scan.nextDouble();
        System.out.println(celsiusToFahrenheit( celsius));
       

	}
	
	public static double celsiusToFahrenheit(double celsius)
	{   double fahrenheit =(celsius*9/5)+32;
		return fahrenheit;
	}
   
	public static double fahrenheitToCelsius(double fahrenheit)
	{   double celsius =(fahrenheit-32)*5/9;
		return celsius;98
	}
}
