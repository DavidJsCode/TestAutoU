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
	private static char[] uppers = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private static char[] specialCharacters = {'!','@','#','$','%','&','*',')','(','_','-','=','+','/','?'};
	
	public static void main(String[] args) {

	String newPassword = enterPassword();
	checkUppercase(newPassword);
	checkSpecialCharacter(newPassword);
	checkUsername(newPassword);
	checkAgainstOldPassword(newPassword);
	}
	
	private static String enterPassword() {
		System.out.println("Enter your new password");
		String password = scanner.next();
		return password;
	}
	
	private static boolean checkUppercase(String text){
		//if string contains  uppercase, return true
		for (int i = 0; i < uppers.length; i++) {
			if (text.contains(uppers[i], 0)) {
				
			}
		}
		//else return false, write message
	}
	
	private static boolean checkSpecialCharacter(String newPassword) {
		
	}
	
	private static boolean checkUsername(String newPassword) {
		
	}

	private static boolean checkAgainstOldPassword(String newPassword) {
	
	}

}
