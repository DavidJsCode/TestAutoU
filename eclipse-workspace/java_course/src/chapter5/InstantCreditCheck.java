package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

public class InstantCreditCheck {
	
		static int requiredSalary = 25000;
		static int requiredCreditScore	= 700;
		static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		double salary = getSalary();
		int creditScore = getCreditScore();
		scanner.close();
		boolean qualified = isUserQualified(creditScore, salary);
		notifyUser(qualified);
		
		}
	
	public static double getSalary() {
		System.out.println("enter your salary");
		double salary = scanner.nextDouble();
		return salary;
		}
	
	public static int getCreditScore() {
		System.out.println("Enter your credit score");
		int creditScore = scanner.nextInt();
		return creditScore;
		
	} 	
	
	public static Boolean isUserQualified(int enteredScore, double enteredSalary) {
		if(enteredScore >= requiredCreditScore && enteredSalary >= requiredSalary) 
			return true;
		else 
			return false;
	}
	
	public static void notifyUser(boolean areTheyQualified) {
		if(areTheyQualified) System.out.println("Congrats, you are approved");
		else System.out.println("Better luck next time");
		
	}

}



