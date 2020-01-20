/*
 *User inputs plan fee and number of overage minutes. 
 *Charge 25 cents for every minute that they've gone over
 *Add a 15% tax on the subtotal.
 *Create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
 *Print this as an itemized bill
 *
 *UPDATE:
 *a phone bill has:
 *an ID
 *a base class
 *a number of allotted minutes
 *a number of minutes used 
1. calculate the overage
2. calculate the tax.
3. calculate the total.
4. print an itemized bill.

include three constructors
    a default one 
    one that accepts the ID only
    one that accepts all fields - id, alloted minutes, minutes used  

No matter which of these constructors you use, all fields should be set eventually.
Create a different class that instantiates the PhoneBill and prints out an itemized bill.

a method that asks for and returns the monthly fee and minutes used

start with the method that prints the bill, that way you know what you need to get returned to that class?
 */

package exercises;

import java.util.Scanner;

public class Ch06CalcPhoneBill {

	static Scanner scanner = new Scanner(System.in);
	static double tax = 0.15;
	static double overCharge = 0.25;
		
	public static void main(String[] args) {	
	
		
	}
	
	public class PhoneBill {
		//
		//
		//
	}
	
	
}
