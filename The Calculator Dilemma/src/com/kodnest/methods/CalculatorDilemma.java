package com.kodnest.methods;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Enter the operation ");
		char operation = scan.next().charAt(0);
		 arthmethicOperations( num1,  num2,operation );
		
        
	}
	
    public static void arthmethicOperations(int a, int b, char operation)
    {
    	
    	switch(operation)
    	{
    	case '+' :
    		System.out.println (a+b); 
    		break;
    	case '-' :
    		System.out.println(a-b ); 
    		break;
    	case '*' :
    		System.out.println( a*b); 
    		break;	
    	case '/' :
    		System.out.println( a/b); 
    		break;	
    	default :
    		System.out.println("Error invalid operator");
    	
    	}
    }
    
    
    
    
    
}
