package com.kodnest.cc.lcc;

public class InfiniteLoopExample4 {

	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			System.out.println("Hello");
			
			for(;;)
			{
				System.out.println("Chinni");
				break;
			}
		}

	}

}
