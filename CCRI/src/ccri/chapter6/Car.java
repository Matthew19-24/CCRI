/**
 * The Car class creates an instance of for a car,
 * holding it's model year, make, and current speed.
 */

package ccri.chapter6;

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-05
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 2 (6.2)
 */
public class Car {
	
	/**
	 * The car's year model.
	 */
	private int yearModel;
	
	/**
	 * The make of the car.
	 */
	private String make = null;
	
	/**
	 * The car's current speed.
	 */
	private int speed;
	
	/**
	 * The setYearModel method stores a value in the yearModel field.
	 * @param year The car's year model.
	 */
	public void setYearModel(int year)
	{
		this.yearModel = year;
		
		// Print to console for debugging
		System.out.println("this.yearModel = " + this.yearModel);
		
	} // End setYearModel.
	
	/**
	 * The getYearModel returns the car's year model.
	 * @return The car's year model.
	 */
	public int getYearModel()
	{
		return this.yearModel;
		
	} // End getYearModel.
	
	/**
	 * The setMake method stores a value in the make field.
	 * @param carMake The car's make.
	 */
	public void setMake(String carMake)
	{
		this.make = carMake;
		
		// Print to console for debugging
		System.out.println("this.make = " + this.make);
		
	} // End setMake.
	
	/**
	 * The getMake method returns the car's make.
	 * @return The car's make.
	 */
	public String getMake()
	{
		return this.make;
		
	} // End getMake.
	
	/**
	 * The setSpeed method stores a value in the speed field.
	 * @param carSpeed The car's current speed.
	 */
	public void setSpeed(int carSpeed)
	{
		this.speed = carSpeed;
		
		// Print to console for debugging
		System.out.println("this.speed = " + this.speed);
		
	} // End setSpeed.
	
	/**
	 * The getSpeed method returns the car's current speed.
	 * @return The car's current speed.
	 */
	public int getSpeed()
	{
		return this.speed;
		
	} // End getSpeed.
	
	/**
	 * The accelerate method adds 5 to the speed field each time it's called.
	 */
	public void accelerate()
	{
		this.speed += 5;
		System.out.println("Speed: " + this.speed); // Debugging
		
	} // End accelerate.
	
	/**
	 * The brake method will subtract 5 from the speed field each time it's called.
	 * Speed cannot go bellow 0.
	 */
	public void brake()
	{
		if (0 < this.speed)
		{
			this.speed -= 5;
			System.out.println("Speed: " + this.speed); // Debugging
		}
		
	} // End break.
	
	/**
	 * Constructor.
	 * @param year The car's year.
	 * @param carMake The car's make.
	 */
	public Car(int year, String carMake)
	{
		this.yearModel = year;
		this.make = carMake;
		this.speed = 0;
		
		// Print to console for debugging
		this.toString();
		
	} // End constructor.
	
	/**
	 * The toString method returns a String representation of the object
	 * @return The String representation of the object.
	 */
	public String toString()
	{
		// Create StringBuilder object
		StringBuilder sb = new StringBuilder();
		
		// Append data to String
		sb.append(" this.getYearModel= " + this.getYearModel());
		sb.append(" this.getMake= " + this.getMake());
		sb.append(" this.getSpeed= " + this.getSpeed());
		
		// Return data
		return sb.toString();
		
	} // End toString.
	
} // End class.
