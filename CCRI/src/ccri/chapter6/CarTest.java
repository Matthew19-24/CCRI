package ccri.chapter6;

/**
 * This program will test the Car class.
 */

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-07
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 2 (6.2)
 */
public class CarTest {

	/**
	 * The main method will create a car object, and then call it's accelerate method five times.
	 * After each call to the accelerate method, it will display the current speed.
	 * Then it will call the brake method five times and display the current speed each time.
	 * @param args Arguments passed by the command line.
	 */
	public static void main(String[] args) 
	{
		// Create Car object.
		Car kia = new Car(2011, "Kia");
		
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Append initial speed.
		sb.append("Speed: ").append(kia.getSpeed());
		
		// Accelerate 5 times
		for (int i = 0; i < 5; i++) 
		{	
			kia.accelerate();
			sb.append("\nAccelerate!");
			sb.append("\nSpeed: ").append(kia.getSpeed());
		}
		
		// Brake 5 times
		for (int i = 0; i < 5; i++)
		{
			kia.brake();
			sb.append("\nBrake!");
			sb.append("\nSpeed: ").append(kia.getSpeed());
		}
	
		JOptionPane.showMessageDialog(null, sb);
		
	} // End main method
	
} // End class
