package exercises;

import java.util.Scanner;

/*Password must be at least eight characters long 
 * contain an uppercase letter.
 * contain a special character
 * not contain the username and 
 * not be the same as the old password.
 */

public class Ch09PasswordCheck {

	private static String oldPassword = "pass1word";
	private static String username = "djar";
	
	private static Scanner scanner = new Scanner(System.in);
	
	// start main
	public static void main(String[] args) {

	String newPassword = enterPassword();
	scanner.close();
	if (!checkUppercase(newPassword)) System.out.println("The password must contain a capital letter");
	if (!checkSpecialCharacter(newPassword)) System.out.println("The password must contain a special character");
	//checkUsername(newPassword);
	//checkAgainstOldPassword(newPassword);
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
	

	private static boolean checkSpecialCharacter(String newPassword) {
		if (!newPassword.matches("[A-Za-z0-9 ]*"))
		return true;
		else return false;
		}
	/*
	private static boolean checkUsername(String newPassword) {
		
	}
	private static boolean checkAgainstOldPassword(String newPassword) {
	
	}
*/
} 
