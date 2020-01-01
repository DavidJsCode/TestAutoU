/*
 * The nested IFs
 * To get a loan the person must:
 * Be employed at current job for at least 2 years
 * Make at least 30,000 
 */

package chapter3;

import java.util.Scanner;

public class LoanQualifier {

	public static void main(String[] args) {
		// Initialize what we know
		int requiredSalary = 30000;
		int requiredYearsEmployed = 2;
				
		//Get what we don't know
		System.out.println("What's your salary?");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		System.out.println("How many years have you worked your current job?");
		double years = scanner.nextDouble();
		
		scanner.close();
		
		//Make the decision
		if(salary >= requiredSalary) {
			
			if (years >= requiredYearsEmployed) {
				System.out.println("You have proven you can make money so we will give you more and profit off your future wages!");
				
			}
			else {
				System.out.println("Sorry, you have not proven your loyalty to a specific bourgeoisie scum since you have not worked there at least " 
						+ requiredYearsEmployed + " years");
			}
		}
		else {System.out.println("You do not make enough money to get money. We will probably take money from you to keep servicing your account. "
				+ "We do this for free for people that make enough money of course. Next time, try to earn more than $" + requiredSalary + ".00");
		}
	}

}
