package com.kodnest.cc.lcc;

public class InfiniteLoopExample2 {

	public static void main(String[] args) {
		for(int i=1;;i++)
		{
			if(i==10)
			{
				System.out.println("Chinni");
				break;
			}
		}

	}

}
