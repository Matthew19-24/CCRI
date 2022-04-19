/**
 * The RouletteWheelColors class is able to determine the color of a pocket on a roulette wheel by number.
 */

package ccri.chapter6;

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-05
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 16 (6.16)
 */
public class RouletteWheelColors {

	/**
	 * The pocket number on the roulette board.
	 */
	private int pocketNumber;
	
	/**
	 * The setPocketNumber method stores a value in the pocketNumber field.
	 */
	public void setPocketNumber()
	{
		pocketNumber = Integer.parseInt(JOptionPane.showInputDialog(null, 
										"Enter a number on the roulette wheel.\n 0-36"));
		
		// Validate input is between 0 and 36
		while (pocketNumber < 0 || pocketNumber > 36)
		{
			JOptionPane.showMessageDialog(null, "Error, invalid pocket number.");
			pocketNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number 0-36"));
			}
	} // End setPocketNumber
	
	/**
	 * The isEven method determines if the pocket is even.
	 * @return true if even, false if odd.
	 */
	public boolean isEven()
	{
		if (this.pocketNumber % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	} // End isEven.
	
	/**
	 * The getPocketColor method calculates what color pocket was landed on by the number given.
	 * Pocket 0 is green.
	 * For pockets 1 through 10, the odd numbered pockets are red and the even numbered pockets are black.
	 * For pockets 11 through 18, the odd numbered pockets are black and the even numbered pockets are red.
	 * For pockets 19 through 28, the odd numbered pockets are red and the even numbered pockets are black.
	 * For pockets 29 through 36, the odd numbered pockets are black and the even numbered pockets are red.
	 * @return The color of the pocket.
	 */
	public String getPocketColor()
	{
		// Pocket 0 is green.
		if (this.pocketNumber == 0)
		{
			return "Green";
		}
		
		// Pockets 1 through 10, odds are red, evens are black.
		else if (this.pocketNumber >= 1 && this.pocketNumber <= 10)
		{
			if (this.isEven())
			{
				return "Black";
			}
			else
				return "Red";
		}
		
		// Pockets 11 through 18, odds are black, evens are red.
		else if (this.pocketNumber >= 11 && this.pocketNumber <= 18)
		{
			if(this.isEven())
			{
				return "Red";
			}
			else
			{
				return "Black";
			}
		}
		
		// Pockets 19 through 28, odds are red, evens are black.
		else if (this.pocketNumber >= 19 && this.pocketNumber <= 28)
		{
			if(this.isEven())
			{
				return "Black";
			}
			else
			{
				return "Red";
			}
		}
		
		// Pockets 29 through 26, odds are black, evens are red.
		else if (this.pocketNumber >= 29 && this.pocketNumber <= 36)
		{
			if(this.isEven())
			{
				return "Red";
			}
			else
			{
				return "Black";
			}
		}
		
		// All others will be an error.
		else
		{
			return "ERROR";
			
		} // End else-if statements.
		
	} // End getPocketColor.
	
	
	/**
	 * The toString method returns String representation of the object.
	 * @return The String representation of the object.
	 */
	public String toString()
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		sb.append(" isEven()= ").append(this.isEven());
		sb.append(" this.getPocketColor()= ").append(this.getPocketColor());
		
		return sb.toString();
		
	} // End toString.
	
} // End class.