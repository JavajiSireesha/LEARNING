package com.kodnest.cc.lcc;

public class InfiniteLoopExample3 {

	public static void main(String[] args) {
		for(int i=1;;i++)
		{
			if(i==10)
			{
				System.out.println("Chinni");
				continue;
			}
			break;
		}

	}

}
