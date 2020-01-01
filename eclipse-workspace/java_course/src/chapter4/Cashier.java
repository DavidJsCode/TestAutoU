/*
 * For Loop
 * scan items
 * tally total
 */

package chapter4;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		// Get number of items to scan in
		System.out.println("How many items are there to scan?");
		Scanner scanner = new Scanner(System.in);
		
		int quantity = scanner.nextInt();
		double total = 0;
		
		//iterate through items 
		for(int i = 0; i < quantity; i++) {
			System.out.println("How much is the item?");
			double price = scanner.nextDouble();
			
			total = total + price;
			
		}
		scanner.close();
		System.out.println("The total is $" + total);
	}

}
