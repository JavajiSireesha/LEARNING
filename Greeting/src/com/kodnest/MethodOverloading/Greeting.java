package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the person name");
		String name =scan.next();
		System.out.println("Greet the person");
		scan.nextLine();
		String greeting = scan.nextLine();
		Greet.greet(name);
        Greet.greet(name ,greeting);
	}

}
