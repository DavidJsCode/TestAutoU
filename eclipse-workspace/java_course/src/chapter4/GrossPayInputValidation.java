/*
 *calculate the salary for employees based on how many hours they have worked. 
 *This one says our program cannot allow for overtime, which means we need to validate the input 
 */
package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

	public static void main(String[] args) {
		// initialize known variables
		int rate = 15;
		int maxHours = 40;
		
		//get the hours worked
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many hours of your life did you waste working this week?");
		double hoursWorked = scanner.nextDouble();
		
		//validate the input
		while (hoursWorked > 40 || hoursWorked < 0 ) {
			System.out.println("Invalid entry, must be between 0 and 40 hours");
			hoursWorked = scanner.nextDouble();
		}
		
		scanner.close();
		
		//do the math
		double gross = hoursWorked * rate;
		System.out.println("Your gross pay is $" + gross );

	}

}
