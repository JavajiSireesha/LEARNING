package com.kodnest.MethodOverloading;

public class DiscountCalculator
{
    //Calculate discounted price for a given percentage
	public static double calculateDiscount(double price , double percentage )
	{
		return price - (price * percentage / 100);

	}
 
	//Calculate discounted price with a fixed amount
		public static double calculateDiscount(double price , int discountAmount )
		{
			return price - discountAmount;

		}
	
}
