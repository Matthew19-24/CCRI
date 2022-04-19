package ccri.chapter6;

/**
 * The aGameOfTwentyOne class creates an instance simulating the
 * functionality of a black jack game with dice.
 */

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-06
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 10 (6.10)
 *
 */
public class aGameOfTwentyOne {
	/**
	 * Holds a running total of the players score.
	 */
	private int playerScore;
	
	/**
	 * Holds a running total of the NPC's score.
	 */
	private int npcScore;
	
	/**
	 * Used for holding the roll of two dice.
	 */
	private int roll;
	
	/**
	 * Die object to simulate rolling.
	 */
	Die die;
	
	/**
	 * The roll method simulates rolling a pair of dice and returns it's total.
	 * @return Total roll of both dice.
	 */
	public int roll()
	{
		// Reset roll count
		this.roll = 0;
		
		// Roll the first die.
		die.roll();
		
		// Add to roll count.
		this.roll = die.getValue();
		
		// Roll the second die.
		die.roll();
		
		// Add to roll count
		this.roll += die.getValue();
		
		return this.roll;
		
	} // End roll
	
	/**
	 * Simulates the player rolling the pair of dice and increases the players score.
	 */
	public void playerRoll() 
	{
		this.playerScore += this.roll();
		System.out.println("Player Score: " + this.getPlayerScore()); // For debugging.
		
	} // End playerRoll.
	
	/**
	 * Simulates the NPC rolling the pair of dice and increases the player's score.
	 */
	public void npcRoll()
	{
		this.npcScore += this.roll();
		System.out.println("NPC Score: " + this.getNpcScore()); // For debugging.
		
	} // End npcRoll.
	
	/**
	 * The getPlayerScore method returns the player's total score.
	 * @return The players total score.
	 */
	public int getPlayerScore()
	{
		return this.playerScore;
		
	} // End getPlayerScore.
	
	/**
	 * The getNpcScore method returns the NPC's total score.
	 * @return The NPC's total score.
	 */
	public int getNpcScore()
	{
		return this.npcScore;
		
	} // End getNpcScore.
	
	/**
	 * The round method simulates the rounds of the game being played.
	 */
	public void round()
	{
		// Set variables
		int answer = -1; // Used for JoptionPane.YES_NO_OPTION
		boolean looper = true; // Used to loop
		
		// loop till game ends
		while (looper)
		{
		
			// Roll for the NPC
			this.npcRoll();
			
			// Ask the user if they would like to roll
			answer = JOptionPane.showConfirmDialog(null, "Your score is " + this.getPlayerScore() +
														 "\nWould you like to roll?",
														 "Roll",
														 JOptionPane.YES_NO_OPTION);
				
			// If user wants to roll
			if (answer == 0)
			{
				// Write to console for debugging
				System.out.println("YES roll.");
					   
				// Roll for the player
				this.playerRoll();
					
				// Check the players score
				if (this.isUnder22(this.getPlayerScore()))
				{
					looper = true;
				}
				else
					looper = false;
					
			}
			// If user does not want to roll
			else
			{
				// Write to console for debugging
				System.out.println("NO don't roll");
				   
				// Return false to stop loop
				looper = false;
			}
		} // End loop.
		
	} // End round.
	
	/**
	 * The isUnder22 method checks if the score in the argument is under 22.
	 * @param score The score of the user or npc.
	 * @return True if the score is under 22, false if above 21.
	 */
	public boolean isUnder22(int score)
	{
		if (22 > score)
		{
			return true;
		}
		else
		{
			return false;
			
		} // End else-if statement.
		
	} // End isUnder22.
	
	/**
	 * The isWinner method compares the scores to decide if the user is a winner of the round.
	 * @param score1 The player to compares score.
	 * @param score2 The opposing player's score.
	 * @return True if player is winner, return false if not a winner.
	 */
	public boolean isWinner(int score1, int score2)
	{
		if (this.isUnder22(score1) && !this.isUnder22(score2))
		{
			System.out.println("isWinner true"); // Debugging.
			return true;
		}
		else if (!this.isUnder22(score1))
		{
			return false;
		}
		else if (score1 > score2)
		{
			return true;
		}
		else
		{
			return false;
			
		} // End of else-if statement
		
	} // End of isWinner.
	
	/**
	 * Default constructor.
	 */
	public aGameOfTwentyOne()
	{
		// Set player scores
		this.playerScore = 0;
		this.npcScore = 0;
		
		// Create Die object
		die = new Die(6, true);
		
	} // End constructor.
	
	/**
	 * Used to determine the final outcome of the game
	 */
	public void outcome()
	{
		boolean playerIsAWinner = this.isWinner(this.getPlayerScore(), this.getNpcScore());
		boolean npcIsAWinner = this.isWinner(this.getNpcScore(), this.getPlayerScore());
				
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Determine winner or tie
		if (playerIsAWinner && !npcIsAWinner)
		{
			sb.append("You win!");
		}
		else if (!playerIsAWinner && npcIsAWinner)
		{
			sb.append("You lose!");
		}
		else
		{
			sb.append("No one won!");
		}
		
		sb.append("\nYou rolled: ").append(this.playerScore);
		sb.append("\nNPC rolled: ").append(this.npcScore);
		
		JOptionPane.showMessageDialog(null, sb);
		
	} // End outcome.
	
	/**
	 * The toString method returns String representation of the object.
	 * @return The String representation of object.
	 */
	public String toString()
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		sb.append(" this.getNpcScore() = ").append(this.getNpcScore());
		sb.append(" this.getPlayerScore() = ").append(this.getPlayerScore());
		
		return sb.toString();
		
	} // End toString.
	
} // End class.
