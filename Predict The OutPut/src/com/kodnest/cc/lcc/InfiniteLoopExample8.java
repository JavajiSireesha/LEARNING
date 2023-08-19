package com.kodnest.cc.lcc;

public class InfiniteLoopExample8 {

	public static void main(String[] args) {
		for(;;)
		{
			System.out.println("Hello");
		while(false)
		{
			System.out.println("Chinni");  //unreachable code
			
		}
		System.out.println("bujji");
		break;
		}

	}

}
