import java.util.Scanner;

public class Temp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
	    int age=scan.nextInt();
		int weight=scan.nextInt();
	    
	    
		if(age>=18)
		{
		   if(weight>50)
		   {
			   System.out.println("You are eligible to donate blood");
		   }
		
		}

	}

}
