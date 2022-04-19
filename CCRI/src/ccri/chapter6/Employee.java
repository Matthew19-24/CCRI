package ccri.chapter6;

/**
 * The Employee class creates an instance for employee's in the company,
 * holding their name, ID number, department and position as fields.
 */

/**
 * @author <b>Author</b>: Matthew McCaughey
 * @author <br> <b>Date</b>: 2022 04-04
 * @author <br> <b>Assignment</b>: Chapter 6, Problem 1 (6.1)
 */
public class Employee {

	/**
	 * Employee's name.
	 */
	private String name;
	
	/**
	 * Employee's ID number.
	 */
	private int idNumber;
	
	/**
	 * Name of the department where the employee works.
	 */
	private String department;
	
	/**
	 * Employee's job title
	 */
	private String position;
	
	
	/**
	 * The setName method stores a value in the name field.
	 * @param eName The employee's name.
	 */
	public void setName(String eName)
	{
		// Set name to eName
		this.name = eName;
		
		// Print to console for debugging
		System.out.println("Name = " + this.name);	
	} // End setName.

	
	/**
	 * The getName method returns the employee's name.
	 * @return The employee's name.
	 */
	public String getName()
	{
		// Print to console for debugging
		System.out.println("Return " + this.name);
		
		return this.name;
	} // End getName.
	
	
	/**
	 * The setID method stores a value in the idNumber field.
	 * @param id The employee's ID number.
	 */
	public void setID(int id)
	{
		// Set idNumber to id
		this.idNumber = id;
		
		// Print to console for debugging
		System.out.println("ID Number = " + this.idNumber);
	} // End setID.
	
	
	/**
	 * The getID method returns the eployee's ID number.
	 * @return The employee's ID number.
	 */
	public int getID()
	{
		// Print to console for debugging
		System.out.println("Return " + this.idNumber);
		
		return this.idNumber;
	} // End getID.
	
	
	/**
	 * The setDepartment method stores a value in the department field.
	 * @param dept The department the employee works.
	 */
	public void setDepartment(String dept)
	{
		// Set department to dept
		this.department = dept;
		
		// Print to console for debugging
		System.out.println("Department = " + this.department);
	} // End setDepartment.
	
	
	/**
	 * The getDepartment method returns the department the employee works in.
	 * @return The department the employee works.
	 */
	public String getDepartment()
	{
		// Print to console for debugging
		System.out.println("Return " + this.department);
		
		return this.department;
	} // End getDepartment.
	
	
	/**
	 * The setPosition method stores a value in the position field.
	 * @param jobTitle Employee's job title.
	 */
	public void setPosition(String jobTitle)
	{
		// Set position to jobTitle
		this.position = jobTitle;
		
		// Print to console for debugging
		System.out.println("Position = " + this.position);
	} // End setPosition.
	
	
	/**
	 * The getPosition method returns the employee's job title.
	 * @return The employee's job title.
	 */
	public String getPosition()
	{
		// Print to console for debugging
		System.out.println("Return " + this.position);
		
		return this.position;
	} // End getPosition.
	
	
	/**
	 * Employee constructor.
	 * @param eName Employee's name.
	 * @param id Employee's ID number.
	 * @param dept Name of the department where the employee works.
	 * @param jobTitle Employee's job title.
	 */
	public Employee(String eName, int id, String dept, String jobTitle)
	{
		// Set variables
		this.name = eName;
		this.idNumber = id;
		this.department = dept;
		this.position = jobTitle;
		
		// Print to console for debugging
		System.out.println(this.toString());
	} // End constructor.
	
	
	/**
	 * Employee constructor.
	 * @param eName Employee's name.
	 * @param id Employee's ID number.
	 */
	public Employee(String eName, int id)
	{
		this(eName, id, " ", " ");
		
		// Print to console for debugging
		System.out.println(this.toString());
	} // End constructor.
	
	
	/**
	 * Default Employee constructor.
	 */
	public Employee()
	{
		this(" ", 0, " ", " ");
		
		// Print to console for debugging
		System.out.println(this.toString());
	} // End constructor.
	
	
	/**
	 * The toString method returns String representation of object.
	 * @return The String representation of object.
	 */
	public String toString()
	{
		// Create StringBuilder object
		StringBuilder sb = new StringBuilder();
		
		// Append all fields to String
		sb.append(" this.getName()= ").append(this.getName());
		sb.append(" this.getID()= ").append(this.getID());
		sb.append(" this.getDepartment()= ").append(this.getDepartment());
		sb.append(" this.getPosition()= ").append(this.getPosition());
		
		return sb.toString();
	} // End toString.
	
	/**
	 * The displayData method is used to return data in a user friendly readable String
	 * @return User friendly readable String
	 */
	public String displayData()
	{
		// Create StringBuilder object
		StringBuilder sb = new StringBuilder();
		
		// Append all fields to display data
		sb.append("Name: ").append(this.name);
		sb.append("\nID Number: ").append(this.idNumber);
		sb.append("\nDepartment: ").append(this.department);
		sb.append("\nPosition: ").append(this.position);
		sb.append("\n\n");
		
		return sb.toString();
	} // End displayData.
} // End class.