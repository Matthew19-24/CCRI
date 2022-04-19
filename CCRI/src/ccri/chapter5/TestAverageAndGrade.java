package ccri.chapter5;
import javax.swing.JOptionPane;

/**
 * The program will ask the user to enter 5 test scores,
 * it should display a letter grade for each score,
 * and then display the average test score. 
 */

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 03-24
 * @author <br> <b>Assignment</b>: Chapter 5, Problem 7 (5.7)
 *
 */
public class TestAverageAndGrade {

	/**
	 * The main method will ask the user to enter 5 test scores,
	 * it will display a letter grade for each score,
	 * and then display the average test score.
	 * The method will loop until the user decides to exit.
	 * @param args Arguments passed by command line.
	 */
	public static void main(String[] args) {
		// Declare variables
		double average = 0; // Used to hold the test score average
		boolean looper = true; // Used to determine if user wants to exit program
		
		// Loop until user exits
		while (looper)
		{
			// Get test scores and determine average
			average = calcAverage();
			
			// Display data and ask to loop again
			looper = goAgain(average);
		}
	}
	
	
	/**
	 * The calcAverage method will loop 5 times,
	 * asking the user to enter a test score,
	 * displaying their letter grade,
	 * and adding it to the running total.
	 * After, it will calculate the test score average.
	 * @return Test score average
	 */
	public static double calcAverage()
	{
		// Declare variables
		double scoreTotal = 0; // Running total of test grades
		double testAverage = 0; // Average score of test grades
		double grade = 0; // Used for user input
		char letterGrade = '0'; // Used to hold the letter grade
		
		// Loop 5 times
		for (int i = 1; i <= 5; i++)
		{
			// Ask for a test grade
			grade = Double.parseDouble(JOptionPane.showInputDialog("Enter a test score"));
			
			// Print to console for debugging
			System.out.println(grade);
			
			// Validate grade is in the range of 0 and 100
			while (0 > grade || 100 < grade)
			{
				// Print to console for debugging
				System.out.println("Invalid input!");
				
				// Ask user to enter test grade
				grade = Double.parseDouble(JOptionPane.showInputDialog("Invalid score.\n" +
															"Must be a valid grade in range of  0 and 100."));
			}
			
			// Add grade to running total
			scoreTotal += grade;
			
			// Print to console for debugging
			System.out.println("Total Score: " + scoreTotal);
			
			// Determine and display the letter grade
			letterGrade = determineGrade(grade);
			JOptionPane.showMessageDialog(null, "Your Grade: " + letterGrade);
			
			// Print to console for debugging
			System.out.println("Letter grade: " + letterGrade);
		}
		
		// Calculate average
		testAverage = scoreTotal / 5;
		
		// Return average
		return testAverage;
	}
	
	
	/**
	 * The determineGrade method will take an integer grade value,
	 * and convert it to a letter grade.
	 * @param grade An integer grade value
	 * @return Character letter grade
	 */
	public static char determineGrade(double grade)
	{
		// Calculate the letter grade
		if (90 <= grade)
		{
			return 'A';
		}
		else if (80 <= grade)
		{
			return 'B';
		}
		else if (70 <= grade)
		{
			return 'C';
		}
		else if (60 <= grade)
		{
			return 'D';
		}
		else
		{
			return 'E';
		}
	}
	

	/**
	 * The goAgain method will ask the user if they would like to loop through the program again.
	 * @param average Test score average to display
	 * @return looper Returns true to loop again, and false to exit program
	 */
	   
	public static boolean goAgain(double average)
	{
		int yesorno = -1; // used to store Yes or No answer
		   
		// Ask user to go again
		yesorno = JOptionPane.showConfirmDialog(null, "Test Score Average: " + average + 
												"\nLetter Grade: " + determineGrade(average) + 
												"\n\nWould you like to enter another 5?", 
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
