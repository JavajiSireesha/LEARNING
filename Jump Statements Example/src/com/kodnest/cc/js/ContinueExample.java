package com.kodnest.cc.js;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
		    if (i == 2) {
		        System.out.println("Skipping iteration at i = " + i);
		        continue;
		    }
		    System.out.println("Current value of i: " + i);
		}
		System.out.println("Loop finished");


	}

}
