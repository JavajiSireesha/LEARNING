package com.kodnest.cc.lcc;

public class NamedWhileLoopExample {

	public static void main(String[] args) {
		
		int m=1;
		
	chinni:	while(m<=5)        //labeled  outside while loop
		{   int n=1;
	bujji:	while(n<=5)        //labeled  inside while loop
			{
				System.out.println("* ");
				n++;
				break chinni;   // break the out side while loop
				
			}
	        m++;
		}

	}

}
