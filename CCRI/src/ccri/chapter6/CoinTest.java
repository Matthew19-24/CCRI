/**
 * This program will test the Coin class.
 */

package ccri.chapter6;

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-12
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 17 (6.17)
 */
public class CoinTest {

	/**
	 * The main method will create an instance of the Coin class.
	 * It will flip the coin 20 times, keeping track of each flip result.
	 * It will display the data, showing all coin sides flipped, and the running total of each.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {
		// Create coin object.
		Coin coin = new Coin();
		
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Show initial coin toss.
		sb.append("Initial coin toss: " + coin.getSideUp());
		
		// Loop 20 times
		for (int x = 0; x < 19; x++)
		{
			// Toss coin
			coin.toss();
			
			// Append to StringBuilder
			sb.append("\n" + coin.getSideUp());
		}
		
		sb.append("\n\nHeads: " + coin.getHeadsCount());
		sb.append("\nTails: " + coin.getTailsCount());
		
		JOptionPane.showMessageDialog(null, sb);

	} // End main.

} // End class.
