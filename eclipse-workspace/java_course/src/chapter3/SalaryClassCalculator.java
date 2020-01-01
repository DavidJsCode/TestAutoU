/*
 IF statement
 All sales people get 1000 bucks a week
 Sales people who sell more than 10 a week, get 250.00 bucks more
 one day, multiples of 10 will get 250 times each multiple more
*/
package chapter3;

import java.util.Scanner;

public class SalaryClassCalculator {

	public static void main(String[] args) {
		// initialize known variables
		int salary = 1000;
		int bonus = 250;
		int quota = 10;
		
		//get unknown variables
		System.out.println("How many sales did you make this week?");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		//figure out how much to pay, do the math
		if (sales > quota) {
			salary = salary + bonus;
		}
		
		//display the results
		System.out.println("The salary to pay is " + salary);
				
		
		
		
		
	}

}
