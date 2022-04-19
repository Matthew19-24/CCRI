package ccri.chapter6;

/**
 * The coin class simulates a coin that gets tossed, heads and tails.
 */

import java.util.Random;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-07
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 17 (6.17)
 */
public class Coin {

	/**
	 * Holds the value of heads or tails.
	 */
	private String sideUp = null;
	
	/**
	 * Running total of heads
	 */
	private int headsCount = 0;
	
	/**
	 * Running total of tails
	 */
	private int tailsCount = 0;
	
	/**
	 * Simulates the tossing of the coin, sets sideUp to "Heads" or "Tails"
	 */
	public void toss()
	{	
		// Holds coin toss value.
		int tossed = 0;
		
		// Create Random object.
		Random rand = new Random();
		
		// Flip coin
		tossed = rand.nextInt(2) + 1;
		
		// Set sideUp value.
		if (tossed == 1)
		{
			this.sideUp = "Heads";
			this.headsCount++;
		}
		else
		{
			this.sideUp = "Tails";
			this.tailsCount++;
		} // End else-if statement.
	} // End toss.
	
	/**
	 * Returns the value stored inside of the sideUp field.
	 * @return The coins side up.
	 */
	public String getSideUp() 
	{
		return this.sideUp;
	} // End getSideUp.
	
	/**
	 * Returns the value stored inside of the headsCount field.
	 * @return Running total of heads.
	 */
	public int getHeadsCount()
	{
		return this.headsCount;
	}
	
	/**
	 * Returns the value stored inside of the tailsCount field.
	 * @return Running total of tails.
	 */
	public int getTailsCount()
	{
		return this.tailsCount;
	}
	
	
	/**
	 * Constructor initializes the sideUp field with a coin toss.
	 */
	public Coin()
	{
		this.toss();
		this.headsCount = 0;
		this.tailsCount = 0;
	}
	
	/**
	 * The toString method returns String representation of object.
	 * @return The String representation of object.
	 */
	public String toString()
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		sb.append(" this.getSideUp()= ").append(this.getSideUp());
		sb.append(" this.getHeadsCount()= ").append(this.getHeadsCount());
		sb.append(" this.getTailsCount()= ").append(this.getTailsCount());
		
		return sb.toString();
	} // End toString.
	
} // End class.
