package com.kodnest.cc.lc;

public class NestedDoWhileLoopExample {

	public static void main(String[] args)
	{
	  int i=1;
	  do
	  {
		  int j=1;
		  do                       //nested do-while loop
		  {
			  System.out.print("Chinni ");
			  j++;
		  }while(j<=5);
		  System.out.println();
		  i++;
	  }while(i<=5);
	  System.out.println("Bujji");
		

	}

}
