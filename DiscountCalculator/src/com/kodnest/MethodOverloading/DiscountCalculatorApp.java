package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class DiscountCalculatorApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Calculate Discount");
        System.out.println("Enter Two double values to calculate Discount");
        double price =scan.nextDouble();
        double percentage = scan.nextDouble();
        System.out.println("Discounted price : $" + DiscountCalculator.calculateDiscount(price , percentage) );
        System.out.println("Enter an integer value to calculate discount");
        int discountAmount = scan.nextInt();
        System.out.println("Discounted price : $" + DiscountCalculator.calculateDiscount(price , discountAmount) );
        
	}

}
