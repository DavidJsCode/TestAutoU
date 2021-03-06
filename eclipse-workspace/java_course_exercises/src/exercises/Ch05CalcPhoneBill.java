/*
 *User inputs plan fee and number of overage minutes. 
 *Charge 25 cents for every minute that they've gone over
 *Add a 15% tax on the subtotal.
 *Create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
 *Print this as an itemized bill
 */

package exercises;

import java.util.Scanner;

public class Ch05CalcPhoneBill {

	static Scanner scanner = new Scanner(System.in);
	static double tax = 0.15;
	static double overCharge = 0.25;
		
	public static void main(String[] args) {	
	
		System.out.println("Enter the monthly fee:");
		double monthlyFee = scanner.nextDouble(); 
		System.out.println("Enter overage minutes:");
		double overageMinutes = scanner.nextDouble();
		scanner.close();
		
		double overageFee = calculateOverage(overageMinutes);
		double totalGross = calculateGross(monthlyFee, overageFee);
		double taxTotal = calculateTax(totalGross);
		double total = calculateTotal(taxTotal, totalGross);
		printBill(monthlyFee, overageFee, taxTotal, total  );
	}
		
		//calc overage fee method
	public static double calculateOverage(double minutes) {
		double overageFee = overCharge * minutes;
		return overageFee;
	}	
		
	public static double calculateGross(double monthlyFee, double overageFee) {
		double totalGross = overageFee + monthlyFee;
		return totalGross;
	}

		//calc tax method
	public static double calculateTax(double totalGross) {
		double taxTotal = (totalGross * tax); 
		return taxTotal;
	}
	
		//calculate total
	public static double calculateTotal(double taxTotal, double totalGross) {
		double total = taxTotal + totalGross;
		return total;
	}
		
		//print total
	public static void printBill(double monthlyFee, double overageFee, double taxTotal, double total) {
		System.out.println("Phone Bill Statement");
		System.out.println("Plan: " + monthlyFee );
		System.out.println("Overage: " + overageFee );
		System.out.println("Tax: " + taxTotal);
		System.out.println("Total: " + total);
	}
	
}
