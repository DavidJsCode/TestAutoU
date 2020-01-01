package chapter3;

import java.util.Scanner;

/*
IF ELSE
all salespeople are expected to make 10 sales per week
when they do, they see a congratulatory message
when they don't, they see how many they were short
*/

public class QuotaCalculator {

	public static void main(String[] args) {
		// initialize the values we know
		int quota = 10;
		
		//get the values we don't know
		System.out.println("How many sales did you make this week?");
		Scanner scanner = new Scanner(System.in);	
		int sales = scanner.nextInt();
		scanner.close();
		
		//decide on the path - output
		if (sales >= quota) {
			System.out.println("Congrats, you have made it possible for capitalism to create more ocean plastic");
		}
		
		else {
			int salesShort = quota - sales;
			System.out.println("While you still participated in this make-believe system, you were " + salesShort + " sales short of the necessary number to be a true plight on the world at large." );
		}
	}

}
