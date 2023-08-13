package com.kodnest.MethodOverloading;

public class Math {

	// Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    public  static double add(double a, double b) {
        return a + b;
    }

    // Add three doubles
    public  static double add(double a, double b, double c) {
        return a + b + c;
    }
}
