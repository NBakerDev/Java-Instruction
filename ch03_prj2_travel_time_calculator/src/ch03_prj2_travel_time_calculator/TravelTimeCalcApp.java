package ch03_prj2_travel_time_calculator;

import java.util.Scanner;

public class TravelTimeCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calc App!");
		//Initializing variables
		Scanner input = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter miles: ");
			int miles = input.nextInt();
			
			System.out.println("Enter mph: ");
			int mph = input.nextInt();
			
			int hours = (int)(miles / mph);
			int minutes = (int)(miles % mph);
			
			double horas = miles / mph;
			int minutos = (int)(horas * 60);
			int horasint = (int)(minutos/60);
			int minFinal = minutos % 60;
			System.out.println("Estimated Travel Time");
			System.out.println("=====================");
			System.out.println("Hours: " + horas);
			System.out.println("Minutes: " + minFinal);
			
			System.out.println("Continue??: ");
			choice = input.next();
		}
		input.close();
		System.out.println("Bye!");
	}
	
}
