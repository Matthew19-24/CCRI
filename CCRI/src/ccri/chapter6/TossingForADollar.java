/**
 * TossingForADollar will work as a game. Each round will flip three coins,
 * a quarter, a nickel and a dime. Each time that a coin lands on heads,
 * the user will earn the amount of the value of that coin. The player will
 * continue to flip until they reach or exceed $1. If they get exactly $1, the
 * player wins, if they exceed $1, the player loses.
 */

package ccri.chapter6;

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-13
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 18 (6.17)
 */
public class TossingForADollar {
		
	/**
	 * The running total balance of winnings (score).
	 */
	private double balance;
		
	// Create Coin objects.
	Coin quarter = new Coin();
	Coin dime = new Coin();
	Coin nickel = new Coin();
	
	/**
	 * The flipCoins method simulates a quarter, a dime and a nickel being tossed.
	 * It then adds the value of each coin that landed on heads to the balance.
	 */
	public void flipCoins()
	{
		// Flip coins.
		this.quarter.toss();
		this.dime.toss();
		this.nickel.toss();
		
		// Add 25 cents if quarter lands heads.
		if (this.quarter.getSideUp().equals("Heads"))
		{
			this.balance += .25;
		}
		// Add 10 cents if dime lands heads.
		if (this.dime.getSideUp().equals("Heads"))
		{
			this.balance += .10;
		}
		// Add 5 cents if nickel lands heads.
		if (this.nickel.getSideUp().equals("Heads"))
		{
			this.balance += .05;
		}
		
	} // End flipCoins.
	
	/**
	 * The showFlips method displays each coin and what side landed up,
	 * it always displays the current balance.
	 */
	public void showFlips()
	{
		// Create StrinBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Append data
		sb.append("Quarter: ").append(this.quarter.getSideUp());
		sb.append("\nDime: ").append(this.dime.getSideUp());
		sb.append("\nNickel: ").append(this.nickel.getSideUp());
		sb.append("\n\nCurrent Balance: ").append(String.format("%.2f", this.balance));
		
		// Display data
		JOptionPane.showMessageDialog(null, sb);
	} // End showFlips.
	
	/**
	 * The getBalance method returns the value in the balance field.
	 * @return The current balance.
	 */
	public double getBalance()
	{
		return this.balance;
	} // End getBalance.
	
	/**
	 * The isWinner method displays a win or lose message depending on the balance.
	 * If exactly $1 the player wins, if balance exceeds $1 the player loses.
	 */
	public void isWinner()
	{
		if (this.balance == 1)
		{
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "YOU LOSE!");
		}
	} // End isWinner.
	
	public String toString()
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Append data
		sb.append(" this.getBalance()= ").append(this.getBalance());
		
		return sb.toString();
				
	} // End toString.
	
} // End class.