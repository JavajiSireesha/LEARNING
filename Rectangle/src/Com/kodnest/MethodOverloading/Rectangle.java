package Com.kodnest.MethodOverloading;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter Three Values");
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		double side = scan.nextDouble();
		System.out.println("Area of rectangle : " + rectangle.calculateArea(length ,  width));
		System.out.println("Area of square : " + rectangle.calculateArea(side));
		
		
		

	}
	
	 // Calculate area of a rectangle
    public double calculateArea(double length, double width)
    {
        return length * width;
    }

    // Calculate area of a square
    public double calculateArea(double side)
    {
        return side * side;
    }


}
