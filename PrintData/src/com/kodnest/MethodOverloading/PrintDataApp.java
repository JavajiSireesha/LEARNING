package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class PrintDataApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		PrintData data = new PrintData();
        System.out.println("Printing Values");
        System.out.println("Enter integer Value : ");
        int num1 = scan.nextInt();
        System.out.println("Enter double Value");
        double num2 = scan.nextDouble();
        System.out.println("Enter String Value");
        String str = scan.next();
        data.print(num1);
        data.print(num2);
        data.print(str);
	}
	

}
