package ccri.chapter4;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * This program will play a game of 10 rounds
 * The player and the NPC will each roll a 6 sided die
 * Whoever has the highest numbers wins the round
 * Whoever wins the most round out of 10 wins
 */

/**
 * @author Matthew McCaughey
 * @date 2022 03-10
 * @Assignment Chapter 4, Problem 21 (4.21)
 *
 */
public class DiceGame {

	/**
	 * The method will use the Random class to generate random numbers
	 * Within a for loop for 10 rounds
	 * It will generate in the range of 1-6 to simulate a die roll
	 * It will do this once for the user, and once for the npc
	 * It will use if-else-if statements to determine the winner of the round
	 * There will be two running totals
	 * One for player wins and one for npc wins
	 * After the loop ends it will determine a total comparing the running totals
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare variables
		int playerRoll = 0; // used to store the user's generated die roll
		int playerScore = 0; // used for running total of wins for the player
		int npcRoll = 0; // used to store the NPC's generated die roll
		int npcScore = 0; // used for running total of wins for the NPC
		String message = null; // used for win, loss or tie output message
		String rollMessage = "Roll again!"; // used to tell user to roll again, or complete game
		
		// create Random object to generate the die rolls
		Random dieRoll = new Random();
		
		// display message to begin rolling
		JOptionPane.showMessageDialog(null, "Press OK to roll the die");
		
		// begin for loop for 10 rounds
		for (int i = 0; i < 10; i++)
		{
			
			// generate the roll of a 6 sided die for player and NPC
			playerRoll = dieRoll.nextInt(6) + 1; 
			npcRoll = dieRoll.nextInt(6) + 1;
			
			// decide outcome by raising correct score's and changing the message
			if (playerRoll > npcRoll)
			{
				playerScore ++;
				message = "\n\nYou win!\n";
			}
			else if (npcRoll > playerRoll)
			{
				npcScore ++;
				message = "\n\nYou lose!\n";
			}
			else
			{
				message = "\n\nIt's a tie!\n";	
			}
			
			// check if message is on last iteration
			if (9 == i)
			{
				// change rollMessage
				rollMessage = "Click OK to see final results";
			}
			
			// display die rolls and output message
			JOptionPane.showMessageDialog(null, "You: " + playerRoll + "\nnpc: " + npcRoll + message + rollMessage);
			
		}
		
		// decide on grand winner
		if (playerScore > npcScore)
		{
			message = "\n\nCongradulations! You win!";
		}
		else if (npcScore > playerScore)
		{
			message = "\n\nToo bad... You lost";
		}
		else
			message = "\n\nIt's an even playing field!";
		
		// display if the player won, lost, or had a tie along with the scores
		JOptionPane.showMessageDialog(null, "Total Score\n\n" + "You: " + playerScore + "\nnpc: " + npcScore +  message);

	}

}
