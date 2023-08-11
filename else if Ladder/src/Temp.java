import java.util.Scanner;

public class Temp {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Score");
		int score =scan.nextInt();
        Grade grade=new Grade();
        grade.giveGrade(score);
	}

}
