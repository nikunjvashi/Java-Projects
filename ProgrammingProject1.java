/*
 * Name: Nikunj Vashi
 * Net ID: nvv140030
 * Date: March 6, 2017
 */

import java.util.Scanner;
import java.lang.Math;
public class ProgrammingProject1 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user
		System.out.println("Enter weight in pounds: ");
		System.out.println("Enter feet: ");
		System.out.println("Enter inches: ");
		//read and save input value
		int weightPounds = input.nextInt();
		int feet = input.nextInt();
		int inches = input.nextInt();
		
		//convert input values
		double meterHeight = ((feet * 12) + inches) * 0.0254;
		double kiloWeight = (weightPounds * 0.45359237);
		//compute bmi
		double bmi = kiloWeight / (meterHeight * meterHeight);
		
		//display output
		System.out.println("BMI is " + bmi);
		
		if (bmi < 18.5) {
			System.out.print("Underweight");
		}
		if (bmi > 18.8 && bmi <= 25) {
			System.out.print("Normal");
		}
		if (bmi > 25 && bmi <= 30) {
			System.out.print("Overweight");
		}
		if (bmi >= 30) {
			System.out.print("Obese");
		}


	}

}
