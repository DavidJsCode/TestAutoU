package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

	public static void main(String[] args) {

		Rectangle kitchen = getRoom();
		Rectangle bathroom = getRoom();
		

	}

	public static Rectangle getRoom() {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter the width");
		double width = scanner.nextDouble();
				
		System.out.println("Enter the length");
		double length = scanner.nextDouble();
		
		scanner.close();
		
		return Rectangle;
	}
	
}
