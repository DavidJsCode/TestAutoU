package chapter2;

import java.util.Scanner;

		public class GrossPayCalculator {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("Enter number of hours worked");
				Scanner scanner = new Scanner(System.in);
				int hours = scanner.nextInt();
				//get hours worked
						
				//get hourly rate
				System.out.println("Enter your hourly pay rate");
				double rate = scanner.nextDouble();
				scanner.close();
				
				//multiply hours and rate
				double grossPay = hours * rate;
				
				//display result
				System.out.println("Your gross pay amount is " + grossPay);
			}

		}

