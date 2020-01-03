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
		int total = 0;
		int result;
		
		//loop the dice
		for (int i=0; i<rolls; i++) {
				
			Random random = new Random();
			int die = random.nextInt(6) + 1;
			total = die + total;
			result = goal - total;
				if( result < 0) 
				System.out.println("You have rolled the number " + die + ". You are on space " + 
			goal + " and have 0 spaces to go." );	
				else System.out.println("You have rolled the number " + die + ". You are on space " + 
						total + " and have " + result  + " spaces to go." );
			
			if(total >= 20) break;
			
		} //marks end of for loop
		
		if(total < 20) {System.out.println("You lost");}
		else {System.out.println("Congrats! You have moved " + goal + " spaces and won the game");}
	}
}
