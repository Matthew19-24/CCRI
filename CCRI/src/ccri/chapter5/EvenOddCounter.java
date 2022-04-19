package ccri.chapter5;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * The program will generate 100 random numbers,
 * and determine how many of them are even, and how many are odd.
 */

/**
 * @author <b>Author</b>Matthew McCaughey
 * @author <br><b>Date</b>: 2022 03-24
 * @author <br><b>Assignment</b>: Chapter 5, Problem 15 (5.15)
 */
public class EvenOddCounter {

	/**
	 * The main method will generate 100 random numbers using the Random class.
	 * It will loop 100 times, generating an integer,
	 * and determining if it is odd or even.
	 * It will collect a running total for all odd and even numbers.
	 * It will display how many of both were counted.
	 * The method will loop until the user decides to exit.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {
		// Declare variables
		int oddNums = 0; // Running total of odd numbers
		int evenNums = 0; // Running total of even numbers
		int ranNum = 0; // Randomly generated integer
		boolean looper = true; // Used to determine when the user wants to exit the program
		
		// Create a Random object
		Random shuffle = new Random();
		
		// Loop until user exits the program
		while (looper)
		{
			// Reset values for the loop
			oddNums = 0;
			evenNums = 0;
			
			// Loop 100 times
			for (int i = 0; i < 100; i++)
			{
				// Generate random integer
				ranNum = shuffle.nextInt();
				
				// Print to console for debugging
				System.out.print("\n" + ranNum + " ");
				
				// If even
				if (isEven(ranNum))
				{
					// Add one to running total of evens
					evenNums++;
					
					// Print to console for debugging
					System.out.println("Even: " + evenNums);
				}
				// If not even
				else
				{
					// Add one to running total of odd numbers
					oddNums++;
					
					// Print to console for debugging
					System.out.println("Odd: " + oddNums);
				}
			}
			
			// Display data, ask to go again
			looper = goAgain(evenNums, oddNums);
		}
		
	}
	
	
	/**
	 * The isEven method will determine if an integer is even or not.
	 * @param num The integer to determine odd or even.
	 * @return Will return true if even, will return false if odd.
	 */
	public static boolean isEven(int num)
	{
		// If the number is even, return true
		if((num % 2) == 0)
		{
			// Print to console for debugging
			System.out.println(true);
			
			// Return data
			return true;
		}
		// If the number is not even, return false
		else
		{
			// Print to console for debugging
			System.out.println(false);
			
			// Return data
			return false;
		}
	}
	
	/**
	 * The goAgain method will determine if the user wants to continue running the program.
	 * @param even The amount of even numbers
	 * @param odd The amount of odd numbers
	 * @return True to loop again, false to exit the program.
	 */
	public static boolean goAgain(int even, int odd)
	{
		int yesorno = -1; // used to store Yes or No answer
		   
		// Ask user to go again
		yesorno = JOptionPane.showConfirmDialog(null, "Even numbers: " + even + 
														"\nOdd Numbers: " + odd + 
														"\n\nWould you like to run again?", "Go Again?", JOptionPane.YES_NO_OPTION);
		   
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
