package com.kodnest.cc.js;

public class BreakExample {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
		    if (i == 3) {
		        System.out.println("Breaking loop at i = " + i);
		        break;
		    }
		    System.out.println("Current value of i: " + i);
		}
		System.out.println("Loop finished");

	}

}
