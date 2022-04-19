package ccri.chapter5;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * This program will generate a random color, and allow the user to guess it.
 * If the user is correct, their score will go up by one.
 * It will repeat 10 times,
 * at the end it will display how many times the user guessed correctly.
 */

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br><b>Date</b>: 2022 03-24
 * @author <br><b>Assignment</b>: Chapter 4, Problem 19 (4.19)
 */
public class ESPGame {

	/**
	 * The main method will loop until the user wants to exit.
	 * It will run the game method and get the running total score.
	 * It will then run the outputMessage method to display the final data.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) {

		// Declare variables
    	int score = 0; // How many times the user guessed correctly
    	boolean looper = true; // Determines if the user wants to exit the program
    	
    	while (looper)
    	{
    		// Run the game and take score as variable
    		score = game();    
    	
    		// Display end message
    		outputMessage(score);
    		
    		// Ask to play again
    		looper = goAgain();
        	}
		}
      
	
	/**
	 * The outputMessage method will display a message based on the users score
	 * @param score The users score at the end of the game
	 */
	public static void outputMessage(int score)
	{
		// Declare variable
		String endMessage = null; // Used to determine message displayed
		
		// Give perfect score end message for 10 points
        if (10 == score)
        {
        	endMessage = "Perfect score! Your ESP is off the charts!";
        }
        // Give a decent score end message for score in the range of 7 and 9
        else if (9 >= score && 7 <= score)
        {
        	endMessage = "Wow! You seem to have high ESP levels!";
        }
        // Give a low score message for score in the range of 4 and 6
        else if (6 >= score && 4 <= score)
        {
        	endMessage = "Your ESP levels are pretty average.";
        }
        // Give a low score message for score in the range of 1 and 3
        else if (3 >= score && 1 <= score)
        {
        	endMessage = "Your ESP levels are low.";
        }
        // Any score of 0 or any other unintentional output will get a bad score
        else
        {
        	endMessage = "You have no ESP levels in you at all...";
        }
        
        // Display how many times the user was correct
        JOptionPane.showMessageDialog(null, endMessage + "\nYou guessed right " + score + " times!");
	}
	
	
	/**
	 * In the game method, the Random class is used.
	 * A String array of colors is initialized.
	 * The for loop is used to loop 10 times,
	 * inside the loop, the Random object generates a number within the Arrays index.
	 * It will pass the number into the Array to decide on the random color.
	 * It will use JOptionPane and its .showOptionDialog method to take multiple choice answers,
	 * allowing the user to guess the color.
	 * It will use an if statement to determine if the color is correct, and add one to the score.
	 * @return Running total of score
	 */
	public static int game()
	{
		// declare variables
    	int userChoice = -1; // used for the multiple choice JOptionPane window
    	int score = 0; // used to keep track of how many times user got guess correct
    	String randomColor = null; // used to hold the randomized color
    	String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"}; //used to display the colors
        
        // Create Random object
        Random randomizer = new Random();
        
        // Begin loop for 10 turns
        for (int x = 0; x < 10; ++x)
        {
        
	       // Generate random color
	       randomColor = colors[randomizer.nextInt(5)];
	       
	       // Print to console for debugging
	       System.out.println("Random Color: " + randomColor);
	        
	        // Ask user to choose a color
	        userChoice = JOptionPane.showOptionDialog(null, "Test your ESP levels!",
	                "ESP Test",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, colors, colors[0]);
	
	        // Use if statement to determine if the choice was correct
	        if (colors[userChoice].equals(randomColor))
	        {
	        	// If correct add 1 point to the score
	        	++score;
	        	
	        	// Print score to console for debugging
	        	System.out.println("Score: " + score);
	        	
	        }
	        
	        // Display the random color
		    JOptionPane.showMessageDialog(null, "The color was " + randomColor);
        }
        
        // Return data
        return score;
	}
	
	
	/**
	 * The goAgain method asks the user if they would like to play again.
	 * @return True if the user wants to play again, false if they want to exit
	 */
	public static boolean goAgain()
	{
		int yesorno = -1; // used to store Yes or No answer
		   
		// Ask user to go again
		yesorno = JOptionPane.showConfirmDialog(null, "Play again?", 
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
