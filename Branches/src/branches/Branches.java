package branches;

import java.util.Scanner;
import java.util.Random;

public class Branches {

public static void calculateSalary() {
	Scanner input = new Scanner(System.in);
	System.out.println("How many hours were worked?: ");
	float hoursWorked = input.nextFloat();
	System.out.println("What is the hourly rate?: ");
	float rate = input.nextFloat();
	
	if(hoursWorked <= 40) { 
		float pay = (rate * hoursWorked);
		System.out.println("Weekly pay is: " + pay);
		
		}
	if(hoursWorked >40) {
	
	float ot = hoursWorked - 40;
	float otpay = (float) ((rate*1.5)*(ot) + (rate*(hoursWorked-ot)));
	System.out.println("Weekly pay is: " + otpay);
	input.close();
	} 
		
	}

public static void guessNumber(){
	Scanner input = new Scanner(System.in);
	Random randomnumb = new Random();
	System.out.println("Please guess a number between 1 and 10, inclusive.: ");
	int guess = input.nextInt();
	int numb = randomnumb.nextInt(10)+1;
	
	if (guess > numb) {
		System.out.println("Too High! :(");
		System.out.println("The number I was thinking of was: " + numb);
	}
	if (guess < numb) {
		System.out.println("Too Low! :(");
		System.out.println("The number I was thinking of was: " + numb);
	}
	if (guess == numb) {
		System.out.println("You Got It! :)");
	}
	input.close();
}


public static void main(String[] args) {  

	calculateSalary();
	
	guessNumber();
	
	
	
	
	}
}