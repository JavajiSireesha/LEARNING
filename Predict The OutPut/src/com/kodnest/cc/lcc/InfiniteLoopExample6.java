package com.kodnest.cc.lcc;

public class InfiniteLoopExample6 {

	public static void main(String[] args) {
		for(;;)
		{
			System.out.println("Hello");
		while(true)
		{
			System.out.println("Chinni");
			break;
		}
		System.out.println("bujji");
		break;
		}

	}

}
