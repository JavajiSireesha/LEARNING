package com.kodnest.cc.lcc;

public class NamedForLoopExample {

	public static void main(String[] args) 
	{
	chinni:	for(int i=1;i<=5;i++)         //named out side for loop
		{
	bujji:		for(int j=1; j<=5;j++)    //named inside for loop
			{
				System.out.print("* ");
				break chinni;
			}
			System.out.println();
		}
			
			
		
	}

}
