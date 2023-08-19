package com.kodnest.ControlConstructs.JumpStatements;

public class ContinueExample1 {

	public static void main(String[] args) {
		System.out.println("Start");
		for(int i=0; i<=7; i++)
		{
			if(i==3)
			{
				System.out.println("Kodnest");
				continue;
			}
			System.out.println("Technologies");
		}

	}

}
