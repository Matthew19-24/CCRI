package ccri.chapter5;
import javax.swing.JOptionPane;

/**
 * This program is built for a paint company.
 * It will ask the customer how many rooms they need painted,
 * how big each room is in square feet,
 * and the cost of the paint they want to use.
 * After all is done, the program will display the total cost of the entire job.
 */

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date: </b> 2022 03-22
 * @author <br> <b>Assignment: </b> Chapter 5, Problem 4 (5.4)
 */
public class PaintJobEstimator {

	// Declare final variables
	final static private double CALC_SQFT = 115; // Every 115 square feet is 1 gallon of paint and 8 hours of labor
	final static private double LABOR_COSTS = 18; // Company is charging 18 per hour
	
	/**
	 * The main method will use JOptionPane to ask for user input.
	 * It will ask the user how many rooms that are being painted,
	 * it will then run a loop to ask how many square feet each room is.
	 * After that, it will ask how much the paint costs,
	 * calculating how many gallons of paint is needed,
	 * and how much the paint will cost after purchasing that amount.
	 * It will calculate the labor needed and the total cost of the labor,
	 * and calculate the total cost of the job.
	 * Finally, it will display all of the data for the user to see.
	 * The method will loop until the user decides to exit.
	 * @param args Arguments passed by command line.
	 */
	
	public static void main(String[] args) {
		
		// declare variables
		int rooms = 0; // The amount of rooms being painted
		int gallons = 0; //The amount of gallons of paint used
		int labor_hours = 0; // The amount of labor hours needed
		double sqft = 0; // Total square feet per room
		double paint_cost = 0; // The cost of paint the user chose
		double paint_total = 0; // The total cost of paint after sqft is calculated
		double labor_cost = 0; // The total cost of labor hours after sqft is calculated
		double total_cost = 0; // The total cost of the job after all calculations
		boolean looper = true; // Used to determine if the user wants to exit
		
		while (looper)
		{
			// Reset variables for the loop
			rooms = 0;
			gallons = 0;
			labor_hours = 0;
			sqft = 0;
			paint_cost = 0;
			paint_total = 0;
			labor_cost = 0;
			total_cost = 0;
			
			// Ask user how many rooms will be painted
			rooms = Integer.parseInt(JOptionPane.showInputDialog("How many rooms are being painted?"));
			
			// Validate input is a positive number
			while (0 >= rooms)
			{
				rooms = Integer.parseInt(JOptionPane.showInputDialog("Invalid input.\n" +
														"Please enter how many rooms are being painted."));
			}
			
			// Get total square feet
			sqft = getSqFt(rooms);
			
			// Ask user to input the cost of paint
			paint_cost = Double.parseDouble(JOptionPane.showInputDialog("How much does your specified paint cost?"));
			
			// Write to console for debugging
			System.out.println("Paint cost: " + paint_cost);
			
			// Calculate the amount of gallons needed
			gallons = paintGallons(sqft);
			
			// Calculate the cost of paint
			paint_total = paintCost(gallons, paint_cost);
			
			// Calculate the hours of labor
			labor_hours = laborHours(sqft);
			
			// Calculate the total cost of labor
			labor_cost = laborCharges(labor_hours);
			
			// Calculate the total cost for job
			total_cost = totalCost(paint_total, labor_cost);
			
			// Output the data
			JOptionPane.showMessageDialog(null, "Gallons Needed: " + gallons +
												"\nTotal Cost of Paint: $" + String.format("%.2f", + paint_total) +
												"\nHours of Labor: " + labor_hours +
												"\nLabor Cost: $" + String.format("%.2f", labor_cost) +
												"\nTotal Cost of Job: $" + String.format("%.2f", total_cost)
												);
			
			// Ask user if they would like to run program again
			looper = goAgain();
		}
		
	}

	
	/** 
	 * The paintGallons method is used to calculate the amount of paint needed.
	 * For every CALC_SQFT, one gallon of paint is needed.
	 * @param sqft The amount of square feet being painted
	 * @return The amount of gallons of paint needed
	 */
	public static int paintGallons(double sqft)
	{
		// Calculate how many gallons of paint are needed
		int gallons = (int) (sqft / CALC_SQFT) + 1;
		
		// Write to console for debugging
		System.out.println("Gallons needed: " + gallons);
		
		// Return the amount of gallons
		return gallons;
	}
	
	
	/**
	 * The getSqFt method takes the amount of rooms being painted,
	 * and loops through them, getting the square feet for each room,
	 * adding a running total and returning that total.
	 * @param rooms The amount of rooms being painted
	 * @return The total amount of square feet
	 */
	public static double getSqFt(int rooms)
	{
		// Declare variable
		double sqft = 0; // Running total for square feet of rooms
		double userInput = 0; // Used to validate user input
		
		// Loop for the amount of rooms that were entered
		for (int i = 1; i <= rooms; i++)
		{
			// Ask how many square feet the room is
			userInput = Double.parseDouble(JOptionPane.showInputDialog("How many square feet is room " + i));
			
			// Validate input is a positive number
			while (0 >= userInput)
			{
				userInput = Double.parseDouble(JOptionPane.showInputDialog("Invalid input.\n" +
																"Please enter how many square feet room " + i + " is."));
			}
			
			// Add userInput to running total
			sqft += userInput;
			
			// Write to console for debugging
			System.out.println("Total Square Feet: " + sqft);
		}
		// Return the data
		return sqft;
	}
	
	
	/**
	 * The laborHours method is used to calculate the amount of hours needed for painting.
	 * For every CALC_SQFT, 8 hours of labor is needed.
	 * @param sqft The amount of square feet being painted
	 * @return The amount of hours of labor needed
	 */
	public static int laborHours(double sqft)
	{
		// Calculate how many gallons of paint are needed
		int hours = (int) ((sqft / CALC_SQFT) + 1) * 8;
		
		// Write to console for debugging
		System.out.println("Hours of Labor: " + hours);
		
		// Return the labor hours
		return hours;
	}
	
	
	/**
	 * The paintCost method is used to calculate the cost of all the paint,
	 * multiplying the amount of gallons needed by the cost per gallon.
	 * @param gallons The amount of gallons being used
	 * @param cost The cost per gallon
	 * @return The total cost of paint
	 */
	public static double paintCost(int gallons, double cost)
	{
		// Calculate the total cost of paint
		double total = gallons * cost;
		
		// Write to console for debugging
		System.out.println("Total cost of paint: " + total);
		
		// Return the total cost of paint
		return total;
	}
	
	
	/**
	 * The laborCharges method is used to calculate the total cost of labor,
	 * multiplying the total labor, and the LABOR_COSTS.
	 * @param labor The amount of labor being used
	 * @return The total cost of labor
	 */
	public static double laborCharges(int labor)
	{
		// calculate the amount of labor charges
		double cost = labor * LABOR_COSTS;
		
		// Write to console for debugging
		System.out.println("Labor costs: " + cost);
		
		// Return the total cost of labor
		return cost;
	}
	
	
	/**
	 * The totalCost method is used to calculate the total cost of the paint job,
	 * adding the cost of labor and the cost of paint together.
	 * @param paintCost The cost of paint
	 * @param laborCost The cost of labor
	 * @return The total cost of the paint job
	 */
	public static double totalCost(double paintCost, double laborCost)
	{
		// Calculate the total amount of the paint job
		double total = paintCost + laborCost;
		
		// Write to console for debugging
		System.out.println("Total cost of paint job: " + total);
		
		// Return the total cost of labor
		return total;
	}
	
	
	/**
	 * The goAgain method will ask the user if they would like to loop through the program again.
	 * @return looper Returns true to loop again, and false to exit program
	 */
	public static boolean goAgain()
	{
		int yesorno = -1; // used to store Yes or No answer
		   
		// Ask user to go again
		yesorno = JOptionPane.showConfirmDialog(null, "Would you like to enter another paint job?", 
												"Go Again?", JOptionPane.YES_NO_OPTION);
		   
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
