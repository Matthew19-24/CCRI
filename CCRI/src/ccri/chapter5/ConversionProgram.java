package ccri.chapter5;
import javax.swing.JOptionPane;

/**
 * The program will ask the user to enter in a distance in meters,
 * it will then allow them to chose how they want to convert the distance.
 * They will be able to convert to kilometers, inches or feet.
 * Within the same menu, they will be able to exit the program. 
 */

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 03-24
 * @author <br> <b>Assignment</b>: Chapter 5, Problem 8 (5.8)
 * 
 */
public class ConversionProgram {

	/**
	 * The main method asks the user to enter a distance in meters,
	 * it will then display options for the user.
	 * They may choose to convert to kilometers, inches, feet, or to exit the program.
	 * When they choose, it will convert the entered distance
	 * into the selected unit. It will then display the data.
	 * The method will loop until the user decides to exit.
	 * @param args Arguments passed by command line.
	 */
	public static void main(String[] args) {
		// Declare variables
		double meters = 0; // User input (distance in meters)
		double conversion = 0; // Measurement converted data
		int choice = -1; // Users menu option
		String unit = null; // Measurement unit type
		boolean looper = true; // Used to determine when user wants to exit program
		
		// Begin program loop
		while (looper)
		{
			// Reset values for the loop
			meters = 0;
			conversion = 0;
			choice = -1;
			unit = null;
			
			// Ask user to enter a distance in meters
			meters = Double.parseDouble(JOptionPane.showInputDialog("Enter a distance in meters"));
			
			// Validate input is above 0
			while (0 > meters)
			{
				meters = Double.parseDouble(JOptionPane.showInputDialog("Invalid input\nA distance cannot be negative!\nEnter again"));
			}
			
			// Display menu and retrieve choice
			choice = menu();
			
			// Determine calculation type by users menu choice
			if (0 == choice) 
			{
				// Calculate kilometers
				conversion = calculateKilometers(meters);
				
				// Set measurement unit type to kilometers
				unit = "kilometers";
			}
			else if (1 == choice) 
			{
				// Calculate inches
				conversion = calculateInches(meters);
				
				// Set measurement unit type to inches
				unit = "inches";
			}
			else if (2 == choice)
			{
				// Calculate feet
				conversion = calculateFeet(meters);
				
				// Set measurement unit type to feet
				unit = "feet";
			}
			else
			{
				// Print to console for debugging
				System.out.println("End loop");
				
				// Any other exit prompt will exit the loop
				looper = false;
				break;
			}
			
			JOptionPane.showMessageDialog(null, meters + " meters is equal to " + String.format("%.2f", conversion) + " " + unit);
			
			
			looper = goAgain();
		}
		

	}
	
	
	/**
	 * The menu method will display a menu of choices for the user.
	 * They can chose kilometers, inches, feet, or exit the program.
	 * @return 0 for Kilometers, 1 for inches, 2 for feet, 3 to exit.
	 */
	public static int menu()
	{
		// Declare variables
		int choice = -1;
		String[] options = {"Kilometers", "Inches", "Feet", "Exit"};
		
		//Display menu and retrieve the users choice
		choice = JOptionPane.showOptionDialog(null, "Choose a convertion method",
                "Convertion Choices",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		
		// Print to console for debugging
		System.out.println("User choice: " + choice);
		
		// Return the choice
		return choice;
	}
	
	
	/**
	 * The calculateKilometers method will convert meters to kilometers
	 * @param meters To be converted to kilometers
	 * @return Converted kilometers
	 */
	public static double calculateKilometers(double meters)
	{
		// Convert to kilometers
		double kilometers = meters * 0.001;
		
		// Print to console for debugging
		System.out.println("Kilometers: " + kilometers);
		
		// Return data
		return kilometers;
	}
	
	
	/**
	 * The calculateInches method will convert meters to inches
	 * @param meters To be converted to inches
	 * @return Converted inches
	 */
	public static double calculateInches(double meters)
	{
		// Convert to inches
		double inches = meters * 39.37;
		
		//Print to console for debugging
		System.out.println("Inches: " + inches);
		
		// Return data
		return inches;
	}
	
	
	/**
	 * The calculateFeet method will convert the meters to feet
	 * @param meters To be converted to feet
	 * @return Converted feet
	 */
	public static double calculateFeet(double meters)
	{
		// Convert to feet
		double feet = meters * 3.281;
		
		// Print to console for debugging
		System.out.println("Feet: " + feet);
		
		// Return data
		return feet;
	}

	
	/**
	 * The goAgain method is used to ask the user if they would like to exit the program.
	 * @return If true the program will continue to loop, if false, the program will exit.
	 */
	public static boolean goAgain()
	   {
		   int yesorno = -1; // used to store Yes or No answer
		   
		   // Ask user to go again
		   yesorno = JOptionPane.showConfirmDialog(null, "Would you like to enter another distance?",
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

