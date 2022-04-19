package ccri.chapter4;
import javax.swing.JOptionPane;

/**
 * The program will gather the amount of years a user wants to calculate rainfall for
 * It will then ask for the amount of rainfall that happened each month during the input amount of years
 * It will output the total amount of months, total amount of rainfall, and the average rainfall per month
 */

/**
 * @author Matthew McCaughey
 * @date 2022 03-07
 * @Assignment Chapter 4, Problem 8 (4.8)
 *
 */
public class AverageRainfall {

	/**
	 * The main method will take user input for an amount of years
	 * It will then iterate through 12 months per year
	 * Using a nested while loop, asking for the amount of rainfall each month
	 * It will then output the total amount of months, the total rainfall and the average rainfall
	 * @param args
	 */
	public static void main(String[] args) {

		// declare variables
		int years = 0;
		int months = 0;
		double rainfall = 0; // used for user input of amount of rainfall each month
		double total_rainfall = 0; // used as a running total of rainfall
		double average_rainfall = 0; // used to hold the average of all rainfall
		
		// ask user for the amount of years
		// validate the input to be anything 1 or higher
		while (years < 1)
			years = Integer.parseInt(JOptionPane.showInputDialog("How many years are you calculating?"));
		
		// calculate amount of months
		months = years * 12;
		
		// loop for the amount of years input
		for (int x = 1; x <= years; x++)
		{
		
			// loop for the 12 months in the year
			for (int month = 1; month <= 12; month++)
			{
				
				// ask user to input the amount of rainfall for the month
				rainfall = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of rainfall that happend during\n" +
						"Year " + x + " Month " + month));
				
				// add rain to the running total
				total_rainfall += rainfall;
			}
		}
		
		// calculate the average rainfall
		average_rainfall = total_rainfall / months;

		// output data
		JOptionPane.showMessageDialog(null, "Months: " + months + "\nTotal Rainfall: " + String.format("%.2f", total_rainfall) + 
				" inches\nAverage Rainfall Per Month: " + String.format("%.2f", average_rainfall) + " inches");
	}

}
