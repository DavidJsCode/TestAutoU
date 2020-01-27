package exercises;

import java.util.Scanner;

/*Password must be at least eight characters long 
 * contain an uppercase letter.
 * contain a special character
 * not contain the username and 
 * not be the same as the old password.
 */

public class Ch08PasswordCheck {

	private static String oldPassword = "P@ss1word";
	private static String username = "D2@jar";
	private static Scanner scanner = new Scanner(System.in);
	
	// start main
	public static void main(String[] args) {

	String newPassword = enterPassword();
	scanner.close();
	if (!checkUppercase(newPassword)) System.out.println("The password must contain a capital letter");
	if (!checkSpecialCharacter(newPassword)) System.out.println("The password must contain a special character");
	if (checkUsername(newPassword)) System.out.println("The password cannot equal the username");
	if (checkAgainstOldPassword(newPassword)) System.out.println("The password cannot match the old password");
	}
	
	private static String enterPassword() {
		System.out.println("Enter your new password");
		String password = scanner.next();
		return password;
	}
	
	private static boolean checkUppercase(String text){
		//if string contains uppercase, return true
		if (!text.equals(text.toLowerCase())) {
			return true;			
		}		
		else return false;
	}

	private static boolean checkSpecialCharacter(String text) {
		if (!text.matches("[A-Za-z0-9 ]*"))
			return true;
		else return false;
		}
	
	private static boolean checkUsername(String text) {
		if (text.equals(username) )
			return true;
		else return false;
	}

	private static boolean checkAgainstOldPassword(String text) {
		if (text.equals(oldPassword))
			return true;
		else return false;
	}
} 
