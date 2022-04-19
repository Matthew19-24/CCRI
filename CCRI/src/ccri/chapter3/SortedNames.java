package ccri.chapter3;
import javax.swing.JOptionPane;

/**
 * This program will take 3 names as user input and output them in ascending order
 */

/**
 * @author Matthew McCaughey
 * @date 2022 02-24
 * @Assignment Chapter 3, Problem 7 (3.7)
 *
 */
public class SortedNames {

	/**
	 * The main method will take 3 names as user input
	 * It will then compare strings and output the names in ascending order
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare variables
		String name1 = null;
		String name2 = null;
		String name3 = null;
		StringBuilder listed = new StringBuilder(); // List of names appended in ascending order
		
		// Get user input
		name1 = JOptionPane.showInputDialog("Please enter 3 names.\nName 1:");
		name2 = JOptionPane.showInputDialog("Please enter 3 names.\nName 2:");
		name3 = JOptionPane.showInputDialog("Please enter 3 names.\nName 3:");

		// Check if name1 is smallest
		if (name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0)
		{
			
			// Check if name2 is smaller than name3
			if (name2.compareToIgnoreCase(name3) <= 0)
			{
				// Append ascending
				listed.append(name1 + "\n");
				listed.append(name2 + "\n");
				listed.append(name3 + "\n");
			}
			
			// Check if name 3 is smaller than name2
			else if (name3.compareToIgnoreCase(name2) <= 0)
			{
				// Append ascending
				listed.append(name1 + "\n");
				listed.append(name3 + "\n");
				listed.append(name2 + "\n");
			}	
		}
		
		// Check if name2 is smallest
		else if (name2.compareToIgnoreCase(name1) <= 0 && name2.compareToIgnoreCase(name3) <= 0)
		{
			
			// Check if name3 is smaller than name1
			if (name3.compareToIgnoreCase(name1) <= 0)
			{
				// Append ascending
				listed.append(name2 + "\n");
				listed.append(name3 + "\n");
				listed.append(name1 + "\n");
				}
			
			// Check if name1 is smaller than name3
			else if (name1.compareToIgnoreCase(name3) <= 0)
			{
				// Append ascending
				listed.append(name2 + "\n");
				listed.append(name1 + "\n");
				listed.append(name3 + "\n");
				}
		}
		
		// Check if name3 is smallest
		else if (name3.compareToIgnoreCase(name1) <= 0 && name3.compareToIgnoreCase(name2) <= 0)
		{
			
			// Check if name1 is smaller than name2
			if (name1.compareToIgnoreCase(name2) <= 0)
			{
				
				// Append ascending
				listed.append(name3 + "\n");
				listed.append(name1 + "\n");
				listed.append(name2 + "\n");
				}
			
			// Check if name2 is smaller than name 1
			else if (name2.compareToIgnoreCase(name1) <= 0)
			{
				// Append ascending
				listed.append(name3 + "\n");
				listed.append(name2 + "\n");
				listed.append(name1 + "\n");
				}
		}
		// Output names
		JOptionPane.showMessageDialog(null, listed);
	}
}