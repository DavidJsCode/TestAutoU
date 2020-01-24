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
	private static char[] uppers = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private static String[] specialCharacters = {"!","@","#","$","%","&","*",")","(","_","-","=","+","/","?"};
	
	private static Scanner scanner = new Scanner(System.in);
	private static boolean result;
	
	// start main
	public static void main(String[] args) {

	String newPassword = enterPassword();
	scanner.close();
	if (!checkUppercase(newPassword)) System.out.println("The password must contain a capital letter");
	//checkSpecialCharacter(newPassword);
	//checkUsername(newPassword);
	//checkAgainstOldPassword(newPassword);
	}
	
	private static String enterPassword() {
		System.out.println("Enter your new password");
		String password = scanner.next();
		return password;
	}
	
	private static boolean checkUppercase(String text){
		//if string contains  uppercase, return true
		result = false;
		for (int i = 0; i < text.length(); i++) {
			char currentLetter = text.charAt(i);
	           if(currentLetter == uppers[i]) {
	                result = true;
	                break;
				}
			}
		return result;		
	}
	
	/*
	private static boolean checkSpecialCharacter(String newPassword) {
		
	}
	
	private static boolean checkUsername(String newPassword) {
		
	}

	private static boolean checkAgainstOldPassword(String newPassword) {
	
	}
*/
} 
