package ccri.chapter5;
import javax.swing.JOptionPane;

/**
 * This program will take the width and length of a rectangle as user input,
 * it will then calculate the area and display it for the user to see.
 */ 

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 03-22
 * @author <br> <b>Assignment</b>: Chapter 5, Problem 3 (5.3)
 *
 */

public class AreaRectangle
{
	
	/**
	 * The main method will ask the user to enter the width and length of a rectangle, 
	 * it will then calculate the rectangle's area,
	 * and display the data.
	 * The method will loop until the user decides to exit.
	 * @param args Arguments passed by command line.
	 */
	
   public static void main(String[] args)
   {
      double length = 0; // Length of rectangle
      double width = 0; // Width of rectangle
      double area = 0; // Area of rectangle
      boolean looper = true; // Used to determine when the user wants to exit
      
      // Loop until user exit's
      while (looper)
      {
    	  // Reset variables for the loop
    	  length = 0;
    	  width = 0;
    	  area = 0;
    	  
    	  // Get rectangle's length
          length = getLength();
       
          // Get rectangle's width
          width = getWidth();

          // Calculate rectangle's area
          area = getArea(length, width);

          // Output the data
          displayData(length, width, area);  
          
          // Ask user if they want to loop again
          looper = goAgain();
      }
      
   }
   
   
   /**
    * The getLength method asks the user to enter the length of a rectangle.
    * @return The entered length
    */
   
   public static double getLength() 
   {
	   // Have the user input the rectangle's length
	   double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle."));
	   
	   // Validate input is greater than 0
	   while (0 >= length)
	   {
		   length = Double.parseDouble(JOptionPane.showInputDialog("Length must be a positive number. Enter again."));
	   }
	   
	   // Write to console for debugging
	   System.out.println("Legnth entered: " + length);
	   
	   // Return the length
	   return length;
   }
   
   
   /**
    * The getWidth method asks the user to enter the width of a rectangle.
    * @return The entered width
    */
   
   public static double getWidth()
   {
	   // Have the user input the rectangle's width
	   double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the rectangle."));
	   
	   // Validate input is greater than 0
	   while (0 >= width)
	   {
		   width = Double.parseDouble(JOptionPane.showInputDialog("Width must be a positive number. Enter again."));
	   }
	   
	   // Write to console for debugging
	   System.out.println("Width entered: " +  width);
	   
	   // Return the width
	   return width;
   }
   
   
   /**
    * The getArea method calculates the area of a rectangle,
    * by multiplying the length and width.
    * @param length The length
    * @param width The width
    * @return The area
    */
   
   public static double getArea(double length, double width)
   {
	   // Calculate the area of the rectangle
	   double area = length * width;
	   
	   // Write to console for debugging
	   System.out.println("Area calculated: " + String.format("%,.2f", area));
	   
	   // Return the area
	   return area;
   }
   
   
   /**
    * The displayData method will display the length, width and area of the rectangle.
    * @param length The length
    * @param width The width
    * @param area The area
    */
   
   public static void displayData(double length, double width, double area)
   {
	   JOptionPane.showMessageDialog(null, "Length: " + length + "\nWidth: " + width + "\nArea: " + String.format("%,.2f", area));
   }
   
   
   /**
    * The goAgain method will ask the user if they would like to loop through the program again.
    * @return looper Returns true to loop again, and false to exit program.
    */
   
   public static boolean goAgain()
   {
	   int yesorno = -1; // used to store Yes or No answer
	   
	   // Ask user to go again
	   yesorno = JOptionPane.showConfirmDialog(null, "Would you like to enter another rectangle?",
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

