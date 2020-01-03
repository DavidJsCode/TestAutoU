/*
 * user enter's name, apply greeting
 */

package chapter5;
import java.util.Scanner;

public class Greetings {

	public static void greetUser(String fname) {
		System.out.println("Hi, " + fname);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		scanner.close();
		greetUser(name);
	}

}
