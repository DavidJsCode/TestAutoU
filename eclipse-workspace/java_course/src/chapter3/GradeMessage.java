/*
 * SWITCH statements
 * User enters their letter grade
 * print out an appropriate message
 */
package chapter3;

import java.util.Scanner;

public class GradeMessage {

	public static void main(String[] args) {
		// get the grade
		System.out.println("Enter your letter grade: ");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		scanner.close();
		
		String message;
		
		//determine the logic
		switch(grade) {
		case "A": 
			message = "You will be an excellent drone";
			break;
				
		case "B":
			message = "Welcome to a life of trying to prove yourself";
			break;
			
		case "C":
			message = "You will toil forever";
			//break;
			
		case "D":
			message = "Welcome to the presidency!";
			break;
			
		case "F":
			message = "You are the new CEO, say good-bye to your former friends";
			break;
			
		default:
			message = "Can you even read?";
			break;
		}
		
		System.out.println(message);
	}

}
