/*
 * User rolls dice
 * Add roll count
 * After 5 rolls user must reach 20
 * If 20 is reached before 5 rolls, stop
 * If does not reach 20, lose
 * 
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times, for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

package exercises;

import java.util.Random;

public class Ch04AddDieGame {

	public static void main(String[] args) {

		//initialize what we know we need
		int rolls = 5;
		int goal = 20;
		//int total = 0;
		//loop the dice
		
	for (int i=0; i<rolls; i++) {
				
		int total = 0;
		do {
			Random random = new Random();
			int die = random.nextInt(6) + 1;
			System.out.println("You have rolled the number " + die + ". You are on space " + total + " and have " + (goal - total) + " spaces to go." );
			total = die + total;
			
			
		} //end of do loop
		
		while (total < 20); //decides whether to continue with do loop, if false, ends loop
			
		if(total < 20) {System.out.println("You lost");}
		else {System.out.println("Congrats! You have moved " + total + " and won the game");}
		
		
	} //marks end of for loop
	
		
	}

}
