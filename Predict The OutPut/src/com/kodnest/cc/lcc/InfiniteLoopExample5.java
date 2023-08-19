package com.kodnest.cc.lcc;

public class InfiniteLoopExample5 {

	public static void main(String[] args) {
		for(;;)
		{
			System.out.println("Hello");
		for(;;)
		{
			System.out.println("Chinni");
			break;
		}
		System.out.println("bujji");
		break;
		}

	}

}
