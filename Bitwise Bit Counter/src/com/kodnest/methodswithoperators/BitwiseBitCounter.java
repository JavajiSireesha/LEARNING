package com.kodnest.methodswithoperators;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int num =scan.nextInt();
		System.out.println("number of set bits : " + countSetBits(num));

	}
	
	
	
     public static int countSetBits(int num) 
     {
		int count = 0;
        while (num > 0)
        {
        	count += num & 1;
        	num >>=1;
        	
        	
        }
		
		return count;
		
	}
	
	

}
