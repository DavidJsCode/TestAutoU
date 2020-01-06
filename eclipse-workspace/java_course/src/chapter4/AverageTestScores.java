/*
 *NESTED LOOPS are the bomb
 *find avg of student's test scores 
 */
package chapter4;

import java.util.Scanner;

public class AverageTestScores {

	public static void main(String[] args) {
		
		//known variables declared and initialized
		int numberOfStudents = 3;
		int numberOfTests = 4;
		Scanner scanner = new Scanner(System.in);
		
		//loop through each student one by one
		for (int i=0; i < numberOfStudents; i++) {
			
			//inside each student, loop to get each test score and add it to itself
			
			//we put the total out here so it gets added to each time the loop iterates
			double total =  0;
			
			//must use a different sentinel variable name
			for (int j=0; j < numberOfTests; j++) {
				System.out.println("Enter the test score for test # " + (j + 1) );
				double score = scanner.nextDouble();
				total = total + score;
				scanner.close();
				
			}
				
			double avg = total/numberOfTests;
			System.out.println("The avergae for student #" + (i + 1) + " is " + avg);
		}
	}

}
