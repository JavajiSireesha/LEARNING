package com.kodnest.cc.lcc;

public class InfiniteLoopExample7 {

	public static void main(String[] args) {
		for(;;)
		{
			System.out.println("Hello");
		while(true)
		{
			break;
			System.out.println("Chinni");  // unreachable code
			
		}
		System.out.println("bujji");
		break;
		}

	}

}
