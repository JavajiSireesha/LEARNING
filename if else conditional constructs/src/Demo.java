import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter Age");
        int age =scan.nextInt();
        Age a1=new Age();
        a1.checkEligibility(age);
	}

}
