/**
 * The Circle class creates an instance of a circle.
 * Taking a radius as an argument, and able to calculate
 * it's area, circumference and it's diameter.
 */

package ccri.chapter6;

import javax.swing.JOptionPane;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-05
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 7 (6.7)
 */
public class Circle {

	/**
	 * The radius of the circle.
	 */
	private double radius;
	
	/**
	 * The value of Pi.
	 */
	final private double PI = 3.14159;
	
	/**
	 * The setRadius method asks the user to enter a radius, and stores the data in the radius field.
	 */
	public void setRadius()
	{
		double rad = 0; // Used for user input
		
		// Have user enter the radius.
		rad = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle"));
				
		// Validate input
		while (rad <= 0)
		{
			rad = Double.parseDouble(JOptionPane.showInputDialog("Cannot be a negative or 0. Enter a radius."));
		} // End loop
		
		this.radius = rad;
	} // End setRadius.
	
	/**
	 * The getRadius method returns the data stored in the radius field.
	 * @return The radius of the circle.
	 */
	public double getRadius()
	{
		return this.radius;
	} // End getRadius.
	
	/**
	 * The area method calculates and returns the area of the circle.
	 * @return The area of the circle.
	 */
	public double area()
	{
		return this.PI * this.radius * this.radius;
	} // End area.
	
	/**
	 * The diameter method calculates and returns the diameter of the circle.
	 * @return The diameter of the circle.
	 */
	public double diameter()
	{
		return this.radius * 2;
	} // End diameter.
	
	/**
	 * The circumference method calculates and returns the circumference of the circle.
	 * @return The circumference of the circle.
	 */
	public double circumference()
	{
		return 2 * this.PI * this.radius;
	} // End circumference.
	
	/**
	 * Circle Constructor
	 * @param rad The radius of the circle.
	 */
	public Circle(double rad)
	{
		this.radius = rad;
	} // End constructor.
	
	/**
	 * Default Circle constructor
	 */
	public Circle()
	{
		this(0.0);
	} // End constructor.
	
	/**
	 * The toString method returns String representation of object.
	 * @return The String representation of object.
	 */
	public String toString()
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Add data to StringBuilder.
		sb.append(this.getClass());
		sb.append(" this.getRadius()= ").append(this.getRadius());
		sb.append(" this.area()= ").append(this.area());
		sb.append(" this.diameter()= ").append(this.diameter());
		sb.append(" this.circumference()= ").append(this.circumference());
		
		return sb.toString();
	} // End toString.
	
	/**
	 * The outCome method returns all of the circles fields in user friendly String
	 * @return User friendly String of all fields.
	 */
	public String outCome()
	{
		// Create StringBuilder object.
		StringBuilder sb = new StringBuilder();
		
		// Add data to StringBuilder.
		sb.append("Radius: ").append(String.format("%,.2f", this.getRadius()));
		sb.append("\nArea: ").append(String.format("%,.2f", this.area()));
		sb.append("\nDiameter: ").append(String.format("%,.2f", this.diameter()));
		sb.append("\nCircumference: ").append(String.format("%,.2f", this.circumference()));
		
		return sb.toString();
	}
	
} // End class.