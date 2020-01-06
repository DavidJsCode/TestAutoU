package exercises;
import java.util.Scanner;

public class Ch02MadLibSentence {

	public static void main(String[] args) {
		// Ask for adjective
		System.out.println("Enter an adjective:");
		Scanner scanner = new Scanner(System.in);
		String adjective = scanner.next();		
		
		// Ask for holiday name
		System.out.println("Enter the name of your favorite season:");
		String season = scanner.next();

		// Ask for a whole number
		System.out.println("Enter a whole number:");
		int numeral = scanner.nextInt();
		
		
		System.out.println("On a " + adjective + " " + season + " day, I drink " + numeral + " cups of coffee.");
		scanner.close();
	}

}
