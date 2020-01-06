package exercises;

import java.util.Scanner;

/*
 * User enters number of pennies, nickels, dimes, quarters
 * Add them
 * Figure if amount = dollar, or greater than, or less than
 * Print the result of the math
 */

public class Ch03AddCoins {

	public static void main(String[] args) {
		// initiate the variables
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		int amount; 
		Scanner scanner = new Scanner(System.in);
		
		//get the values
		System.out.println("How many quarters do you want?");
		quarters = (scanner.nextInt() * 25);
		
		System.out.println("How many dimes do you want?");
		dimes = (scanner.nextInt() * 10);
		
		System.out.println("How many nickels do you want?");
		nickels = (scanner.nextInt() * 5);
				
		System.out.println("How many pennies do you want?");
		pennies = (scanner.nextInt() * 1);
		
		//add the coins
		amount = quarters + dimes + nickels + pennies;
		scanner.close();
		
		if(amount < 100)
			System.out.println("You are " + (100 - amount) + " cents short");
		else if(amount > 100)
			System.out.println("You are " + (amount - 100) + " cents over");
		else System.out.println("You win!");			
					
	}
	

}
