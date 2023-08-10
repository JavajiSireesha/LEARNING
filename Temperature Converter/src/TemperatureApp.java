import java.util.Scanner;

public class TemperatureApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
        System.out.println("Enter Fahrenheit Temperature");
        double fahrenheit=scan.nextDouble();
        Temperature temperature=new Temperature();
        double celsius =temperature. covertFaherenheitToCelsius(fahrenheit);
        System.out.println(celsius);
}
}