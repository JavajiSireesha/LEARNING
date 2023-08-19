package com.kodnest.cc.lcc;

public class NamedDoWhileLoopExample {

	public static void main(String[] args) {
		int i = 1;
	chinni :	do {             //labeled outside do while loop
		    int j=1;
	bujji:	    do              //labeled  inside do while loop
		    {
		       
               System.out.print("* ");
               j++;
                break chinni;   // break the outside do while loop
               
		    }  while(j<=5);
		    	
		}while(i<=5);
		    	
	}

}
