package com.kodnest.methodswithoperators;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean isValid=scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean meetsCondition=scan.nextBoolean();
		boolean isInputValid = isValidInput(isValid ,meetsCondition);
		
		if(isInputValid)
		{
			System.out.println("Input is Valid");
		}
		else
		{
			System.out.println("Input is not Valid");
		}

	}
	
	
     public static boolean isValidInput(boolean isValid , boolean meetsCondition) 
     {
		boolean isInputValid = isValid && meetsCondition;
		
		return isInputValid;

	}

}
