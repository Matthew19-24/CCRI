package ccri.chapter5;
import javax.swing.JOptionPane;

/**
 * The program will gather the amount of years a user wants to calculate rainfall for
 * It will then ask for the amount of rainfall that happened each month during the input amount of years
 * It will output the total amount of months, total amount of rainfall, and the average rainfall per month
 */

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 03-24
 * @author <br> <b>Assignment</b>: Chapter 4, Problem 8 (4.8)
 *
 */
public class AverageRainfall {

	/**
	 * The main method will take user input for an amount of years,
	 * looping through 12 months per year,
	 * it will ask for the amount of rainfall each month.
	 * It will then output the total amount of months, the total rainfall and the average rainfall.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {

		// declare variables
		int years = 0; // Amount of years for calculation
		int months = 0; // Amount of months in the years
		double total_rainfall = 0; // used as a running total of rainfall
		double average_rainfall = 0; // used to hold the average of all rainfall
		boolean looper = true; // Used to determine if user wants to exit program
		
		// Begin program loop
		while (looper)
		{
			// Ask the user how many years they want to calculate
			// Validate if the input is 1 or higher
			while (years < 1)
			{
				years = Integer.parseInt(JOptionPane.showInputDialog("How many years are you calculating?"));
			}
			
			// Calculate amount of months
			months = calculateMonths(years);
			
			// Calculate total rainfall
			total_rainfall = totalRainfall(years);
			
			// Calculate the average rainfall
			average_rainfall = averageRainfall(total_rainfall, months);

			// Output data
			JOptionPane.showMessageDialog(null, "Months: " + months + "\nTotal Rainfall: " + String.format("%,.2f", total_rainfall) + 
					" inches\nAverage Rainfall Per Month: " + String.format("%,.2f", average_rainfall) + " inches");
			
			// Ask if user wants to exit or loop again
			looper = goAgain();
		}
		}
		
		
	
	
	/**
	 * The calculateMonths method will take years as input
	 * and calculate the amount of months are involved.
	 * @param years How many years to calculate.
	 * @return How many months are in determined years.
	 */
	public static int calculateMonths(int years)
	{
		// Multiply 12 months for each year
		int months = years * 12;
		
		// Return the amount of months
		return months;
	}
	
	
	/**
	 * The totalRainfall method takes how many years the user input
	 * and asks how much rainfall happened each month within that time frame.
	 * It will keep a running total and return the total rainfall.
	 * @param years The amount of years the user wants to calculate.
	 * @return The total amount of rainfall.
	 */
	public static double totalRainfall(int years)
	{
		// Declare variables
		double total_rainfall = 0; // Running total
		double rainfall = 0; // User input
		
		// Loop for how many years
		for (int x = 1; x <= years; x++)
		{
		
			// Loop for the 12 months
			for (int month = 1; month <= 12; month++)
			{
				
				// Ask user to input the amount of rainfall for the month
				rainfall = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of rainfall in inches that happend during\n" +
																		"Year " + x + " Month " + month));
				
				// Validate input is not negative
				while (0 > rainfall)
				{
					rainfall = Double.parseDouble(JOptionPane.showInputDialog("Invalid Input\nCannot be negative\n" +
														"Enter the amount of rainfall that happened during\n" +
														"Year " + x + " Month " + month));
				}
				
				// Add rain to the running total
				total_rainfall += rainfall;
				
				// Print to console for debugging
				System.out.println("Total Rainfall: " + total_rainfall);
			}
		}
		return total_rainfall;
	}
	
	
	/**
	 * The averageRainfall method calculates the average rainfall
	 * by dividing the total rainfall by the total months.
	 * @param rainfall The running total of rainfall over time.
	 * @param months The total amount of months calculated.
	 * @return The average rainfall.
	 */
	public static double averageRainfall(double rainfall, int months)
	{
		// Calculate average rainfall
		double average_rainfall = rainfall / months;
		
		// Print to console for debugging
		System.out.println("Average Rainfall: " + average_rainfall);
		
		return average_rainfall;
	}
	
	/**
	 * The goAgain method is used to determine if the user wants
	 * to exit the program or run it again.
	 * @return true if user wants to continue loop, false if user wants to exit.
	 */
	public static boolean goAgain()
	{
		int yesorno = -1; // used to store Yes or No answer
		   
		// Ask user to go again
		yesorno = JOptionPane.showConfirmDialog(null, "Would you like to calculate another?", "Go Again?", JOptionPane.YES_NO_OPTION);
		   
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
