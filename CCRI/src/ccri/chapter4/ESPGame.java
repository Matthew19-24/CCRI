package ccri.chapter4;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * This program will generate a random color, and allow the user to guess it
 * If the user is correct, their score will go up by one
 * It will repeat 10 times
 * At the end it will display how many times the user guessed correctly
 */

/**
 * @author Matthew McCaughey
 * @date 2022 03-09
 * Assignment Chapter 4, Problem 19 (4.19)
 *
 */
public class ESPGame {

	/**
	 * In the main method, the Random class is used
	 * A String array of colors is initialized
	 * The for loop is used to loop 10 times
	 * Inside the loop, the Random object generates a number within the Arrays index
	 * It will pass the number into the Array to decide on the random color
	 * It will use JOptionPane and its .showOptionDialog method to take multiple choice answers
	 * Allowing the user to guess the color
	 * It will use an if statement to determine if the color is correct, and add one to the score
	 * At the end of the loop, it will use else-if statements to determine an output message
	 * Along with telling the user what their final score was
	 * @param args
	 */
	public static void main(String[] args) {

		// declare variables
    	int userChoice = -1; //used for the multiple choice JOptionPane window
    	int score = 0; // used to keep track of how many times user got guess correct
    	String randomColor = null; // used to hold the randomized color
    	String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"}; //used to display the colors
    	String endMessage = null; // used to display either a congratulations or failure message
        
        // create Random object
        Random randomizer = new Random();
        
        // being loop for 10 turns
        for (int x = 0; x < 10; ++x)
        {
        
	        // generate random color
	       randomColor = colors[randomizer.nextInt(5)];
	        
	        // ask user to choose a color
	        userChoice = JOptionPane.showOptionDialog(null, "Test your ESP levels!",
	                "ESP Test",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, colors, colors[0]);
	
	        // use if statement to determine if the choice was correct
	        if (colors[userChoice].equals(randomColor))
	        {
	        	// if correct add 1 point to the score
	        	++score;
	        }
	        
	        // display the random color
	        JOptionPane.showMessageDialog(null, "The color was " + randomColor);
        }
        
        // give perfect score end message for 10 points
        if (10 == score)
        {
        	endMessage = "Perfect score! Your ESP is off the charts!";
        }
        // give a decent score end message for score in the range of 7 and 9
        else if (9 >= score && 7 <= score)
        {
        	endMessage = "Wow! You seem to have high ESP levels!";
        }
        // give a low score message for score in the range of 4 and 6
        else if (6 >= score && 4 <= score)
        {
        	endMessage = "Your ESP levels are pretty average.";
        }
        // give a low score message for score in the range of 1 and 3
        else if (3 >= score && 1 <= score)
        {
        	endMessage = "Your ESP levels are low.";
        }
        // any score of 0 or any other unintentional output will get a bad score
        else
        {
        	endMessage = "You have no ESP levels in you at all...";
        }
        
        // display how many times the user was correct
        JOptionPane.showMessageDialog(null, endMessage + "\nYou guessed right " + score + " times!");

	}

}
