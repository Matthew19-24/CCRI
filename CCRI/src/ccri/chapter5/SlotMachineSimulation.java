package ccri.chapter5;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * The program will simulate a slot machine. 
 * It will allow the user to input a bet.
 * It will randomly draw 3 slots, out of 6 choices.
 * If there are 2 matches, the user wins x2 of their bet
 * If there are 3 matches, the user wins x3 of their bet
 * This will loop until the user decides to quit
 * When the user quits, it will tell them their total bets and total winnings
 */

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br><b>Date</b>: 2022 03-24
 * @author <br><b>Assignment</b>: Chapter 4, Problem 22 (4.22)
 *
 */
public class SlotMachineSimulation {

	/**
	 * The main method will allow the user to enter a bet amount
	 * When the user decides to stop placing bets they may click Cancel
	 * It will then display the total amount of bets and total winnings.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {

		// declare variables
		boolean looper = true; // Used to determine if player wants to exit
		int bet = 0; // used as users bet
		int betsTotal = 0; // running total of all users bets
		int winning = 0; // used to display the winning amount
		int winningTotal = 0; // running total of all winnings
		
		// begin game loop
		while (looper)
		{
			// Take user input as bet amount
			bet = Integer.parseInt(JOptionPane.showInputDialog("Enter bet in dollars"));
			
			// Validate user input is over 0
			while (0 >= bet)
			{
				bet = Integer.parseInt(JOptionPane.showInputDialog("Can not bet negative or 0!\nEnter a bet in dollars!"));
			}
			System.out.println("Bet: " + bet);
			
			// Add bet to running total
			betsTotal += bet;
			System.out.println("Total Bets: " + betsTotal); // Debugging
			
			// Spin slots and receive winning
			winning = spinSlot(bet);
			System.out.println("Winning: " + winning); // Debugging
			
			// Add winning to total
			winningTotal += winning;
			System.out.println("Winning Total: " + winningTotal); // Debugging
			
			// Ask to loop again
			looper = goAgain();
		}
		
		// Display total winnings
		JOptionPane.showMessageDialog(null, "Total Bets: $" + betsTotal + "\nTotal Winnings: $" + winningTotal);
	}
	
		
	/**
	 * The checkMatches method will take all 3 slot Strings as input,
	 * and determine how many matches there are.
	 * If there are two matches, the user wins x2 the amount of money
	 * If there are three matches, the user wins x3 the amount of money 
	 * It will then output the winnings multiplier.
	 * @param slot1 First slot
	 * @param slot2 Second slot
	 * @param slot3 Third slot
	 * @return Winnings Multiplier
	 */
	public static int checkMatches(String slot1, String slot2, String slot3)
	{	
		// check for 3 matches
		if (slot1.equals(slot2) && slot1.equals(slot3))
		{
			// wins 3x the amount
			return 3;
		}
		// check for 2 matches
		else if (slot1.equals(slot2) || slot1.equals(slot3) || slot2.equals(slot3))
		{
			// Wins 2x the amount
			return 2;
		}
		// If no matches			
		else
		{
			// No winning
			return 0;
		}
					
	}
	
	
	/**
	 * The spinSlot method will use a Random integer (1-6) 
	 * as an index number inside of a String array,
	 * this will allow all 3 slots to have a random word.
	 * It will then use the checkMathes method to check what winning multiplier is
	 * Multiplying the bet, and returning the win
	 * @param bet The players bet
	 * @return Winning amount
	 */
	public static int spinSlot(int bet)
	{
		// Declare variables
		String[] slots = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"}; // simulating slot machine
		String slot1 = null; // 1st slot
		String slot2 = null; // 2nd slot
		String slot3 = null; // 3rd slot
		int winning = 0; // Amount won from game
		
		// create a Random object
		Random random = new Random();
		
		// Generate the slots
		slot1 = slots[random.nextInt(6)];
		slot2 =  slots[random.nextInt(6)];
		slot3 =  slots[random.nextInt(6)];
		
		// Check for matches and multiply winning
		winning = bet * checkMatches(slot1, slot2, slot3);
		
		// Display the win / loss
		JOptionPane.showMessageDialog(null, slot1 + "|" + slot2 + "|" + slot3 + "\nYou win: $" + winning);
		
		return winning;
	}
	
	
	/**
	 * The goAgain method is used to determine if the user wants to exit the game
	 * @return True if user wants to play again, false if user wants to exit
	 */
	public static boolean goAgain()
	{
		int yesorno = -1; // used to store Yes or No answer
		   
		// Ask user to go again
		yesorno = JOptionPane.showConfirmDialog(null, "Play again?", 
												"Go Again?", JOptionPane.YES_NO_OPTION);
		   
		if (yesorno == 0)
		{
			// Write to console for debugging
			System.out.println("YES loop again.");
			   
			// Return true to continue loop
			return true;
		}
		else
		{
			// Write to console for debugging
			System.out.println("NO don't loop again.");
			   
			// Return false to stop loop
			return false;
		}
	}
}