/**
 * This program tests the aGameOfTwentyOne class. Playing a game of Twenty One until the user wants to quit.
 */

package ccri.chapter6;

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-12
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 10 (6.10)
 */
public class aGameOfTwentyOneTest {

	/**
	 * The main method will simulate A Game of Twenty One using the aGameOfTwentyOne class.
	 * It will loop the program until the user wants to quit.
	 * Inside the game loop, it will loop the round method, allowing the user to
	 * continue rolling the dice until they decide to stop.
	 * At the end it will use the outcome method to decide who won, displaying the outcome.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {
		// Create variables
		int playAgain = 0; // For looping game
		
		while (playAgain == 0)
		{
			// Create aGameOfTwentyOne object.
			aGameOfTwentyOne game = new aGameOfTwentyOne();
			
			// Play rounds of game
			game.round();
			
			// Check outcome
			game.outcome();
			
			// Check if user wants to play again
			playAgain = JOptionPane.showConfirmDialog(null, "Would you like to play again?",
					 										"Play Again?",
					 										JOptionPane.YES_NO_OPTION);
			
		} // End loop
		
	} // End main method.

} // End class.
