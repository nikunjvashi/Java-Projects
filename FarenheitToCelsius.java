import java.util.Scanner;
public class FarenheitToCelsius {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		//declare vars
		double farenheit;
		
		//prompt user
		//read user input
		System.out.println("Enter Fareneheit temperature");
		farenheit = input.nextDouble();
		
		//calculate answer
		double celsius = (farenheit - 32) * 5/9.0;
		
		//display answer
		System.out.println("The temperature in Celsius is " + celsius + " degrees.");
		
		
	}

}
