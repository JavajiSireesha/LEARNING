package com.kodnest.cc;
import java.util.Scanner;

public class Main {
	
	public static void checkMultipleOfTen(int n)

	{
       
	   if(n%10==0)
	   {
		   System.out.println("The number Is Multiple of 10");
	   }
	   else
	   {
		   System.out.println("The number Is  not Multiple of 10");
	   }
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		checkMultipleOfTen(num);

	}

}
