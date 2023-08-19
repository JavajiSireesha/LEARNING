package com.kodnest.cc.lcc;

public class InfiniteLoopExample10 {

	public static void main(String[] args) {
		do
		{
			System.out.println("Hello");
		for(int i=1;i<=100; i=i+3)
		{
			System.out.println("Chinni");
			if(i==19)
			{
				break;
			}
		  }
		System.out.println("bujji");
		break;
		}while(true);

	}

}
