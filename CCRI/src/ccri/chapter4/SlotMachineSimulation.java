package ccri.chapter4;
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
 * @author Matthew McCaughey
 * @date 2022 03-10
 * @Assignment Chapter 4, Problem 22 (4.22)
 *
 */
public class SlotMachineSimulation {

	/**
	 * The main method will allow the user to enter a bet amount
	 * It will then use a Random object (1-6) as an index number inside a String array
	 * This will allow all 3 slots to have a random word
	 * If there are two matches, the user wins x2 the amount of money
	 * If there are three matches, the user wins x3 the amount of money
	 * When the user decides to stop placing bets they may click Cancel
	 * It will then display the total amount of bets and total winnings.
	 * @param args
	 */
	public static void main(String[] args) {

		// declare variables
		String[] slots = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"}; // simulating slot machine
		String slot1 = null; // 1st slot
		String slot2 = null; // 2nd slot
		String slot3 = null; // 3rd slot
		String message = null; // used to store display message
		String play = "Yes"; // used to keep the loop until player wants to quit
		int bet = 0; // used as users bet
		int betsTotal = 0; // running total of all users bets
		int winning = 0; // used to display the winning amount
		int winningTotal = 0; // running total of all winnings
		
		// create a Random object
		Random random = new Random();
		
		// take user input as bet amount and add it to total
		play = JOptionPane.showInputDialog("How much would you like to bet in dollar amounts?");
		betsTotal += bet;
		
		// begin game loop
		while (null != play)
		{
			
			// convert user input into integer
			bet = Integer.parseInt(play);
			
			// generate the slots
			slot1 = slots[random.nextInt(6)];
			slot2 =  slots[random.nextInt(6)];
			slot3 =  slots[random.nextInt(6)];
			
			// check for 3 matches
			if (slot1.equals(slot2) && slot1.equals(slot3))
			{
				// wins 3x the amount
				message = "\nThree matches!!\n";
				winning = bet * 3;
				winningTotal += winning;
			}
			// check for 2 matches
			else if (slot1.equals(slot2) || slot1.equals(slot3) || slot2.equals(slot3))
			{
				// wins 2x the amount
				message = "\nTwo matches!\n";
				winning = bet * 2;
				winningTotal += winning;
			}
			
			else
			{
				message = "\nNo matches.\n";
				winning = 0;
			}
			
			// display the win / loss
			JOptionPane.showMessageDialog(null, slot1 + "|" + slot2 + "|" + slot3 + message + "You win: $" + winning);
			
			// ask user if they would like to play again, type -1 to end loop
			play = JOptionPane.showInputDialog("Place bet to play again, press cancel to cash out.");
			betsTotal += bet;
			
			
		}
		
		// Display total winnings
		JOptionPane.showMessageDialog(null, "Total Bets: $" + betsTotal + "\nTotal Winnings: $" + winningTotal);
	}

}
