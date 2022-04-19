package ccri.chapter6;

/**
 * This program will test the TossingForADollar class.
 */

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-13
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 18 (6.17)
 */
public class TossingForADollarTest {

	/**
	 * The main method will create the TossingForADollar object.
	 * It will then create a loop until the user decides to exit.
	 * Inside the loop will be a loop for each round of the game.
	 * For each round, it will call the flipCoins method and the showFlips method,
	 * this will imitate all of the coins being flipped, accumulating the balance,
	 * and showing the results. Once the balance reaches or exceeds $1 the loop will end,
	 * and then the isWinner method is called, to determine the outcome of the game.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {
		
		// Create loop variable
		int looper = 0;
		
		while (looper == 0)
		{
			
			// Create TossingForADollar object.
			TossingForADollar game = new TossingForADollar();
			
			// Loop for each round of the game until balance reaches or exceeds $1
			while (game.getBalance() < 1)
			{
				game.flipCoins();
				game.showFlips();
			}
			
			// Determine if win or loss.
			game.isWinner();
			
			// Ask if user wants to play again.
			looper = JOptionPane.showConfirmDialog(null, "Would you like to play again?",
					 									 "Play Again?",
					 									 JOptionPane.YES_NO_OPTION);
			
		} // End loop.
		
	} // End main.

} // End class.