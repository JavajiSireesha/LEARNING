package com.kodnest.cc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in); 
	 int num = scan.nextInt();
     nthFibonacciNumber(num);
	}
	public static void nthFibonacciNumber(int num) {
		int num1=0;
		int num2=1;
		int num3;
		for(int i =0; i<num;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		System.out.println(num1);
	}

}
