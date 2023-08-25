import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter Two Numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        findGCD( a , b);
	}
	public static void findGCD(int a ,int b)
	{
		int gcd = 0;
		for(int i=1; i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd =i;
			}
		}
		System.out.println(gcd);
	}

}
