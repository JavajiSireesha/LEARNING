package com.kodnest.MethodOverloading;

public class Operations
{

	//Check if a number is even
	
	public boolean isEven(int num)
	{
		return num % 2 == 0;

	}

	//Check if a number is even
	
		public boolean isEven(double num)
		{
			return  num % 2 == 0;

		}
}
