package com.kodnest.MethodOverloading;

import java.util.Scanner;

public class TimeConvertor {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Values");
		int hours = scan.nextInt();
		int minutes = scan.nextInt();
		int seconds = scan.nextInt();
		System.out.println("2 hours in minutes : " + convert( hours));
		System.out.println("2 hours and 30 minutes in minutes : " + convert(minutes));
		System.out.println("2 hours , 30 minutes,15 seconds in seconds : " + convert(hours , minutes ,seconds));

	}

	
	// Convert hours to minutes
    public static int convert(int hours) 
    {
        return hours * 60;
    }

    // Convert hours and minutes to minutes
    public static int convert(int hours, int minutes)
    {
        return hours * 60 + minutes;
    }

    // Convert hours, minutes, and seconds to seconds
    public static int convert(int hours, int minutes, int seconds) 
    {
        return hours * 3600 + minutes * 60 + seconds;
    }

    
	
}
