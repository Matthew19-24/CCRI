/**
 * This object represents a single circle.
 *
 */
package ccri.chapter7;

/**
 * This object represents a single circle. The circle has a radius.
 * 
 * @author dean grammas (refactored from "Starting out with Java - Gaddis, Muganda", Chapter 6 - Problem 7)
 */
public class Circle
{
    final static double PI = 3.1415926535;  // 10 digits...why not :-)
    
    /**
     * The radius
     */
    private double radius;

    
    /**
     * Gets the radius
     * @return the radius
     */
    public double getRadius()
    {
	return radius;
    }

    
    /**
     * Sets the radius.
     * @param radius the radius to set
     */
    private void setRadius(double radius)
    {
	this.radius = radius;
    }

    /**
     * Circle constructor
     * 
     * @param radius the radius of the circle
     */
    public Circle(double radius)
    {
	super();
	this.setRadius(radius);
    }

    
    /**
     * Gets the area of the circle
     * @return the area of the circle
     */
    public double getArea()
    {
	return (Circle.PI * this.getRadius() * this.getRadius());
    }

    /**
     * Gets the diamater of the circle.
     * @return the diamater of the circle.
     */
    public double getDiameter()
    {
	return (this.getRadius() * 2);
    }

    /**
     * Gets the circumference of the circle
     * @return the circumference of the circle
     */
    public double getCircumference()
    {
	return (Circle.PI * this.getRadius() * 2);
    }

    /**
     * Returns an unserialized representation of this object as a <code>java.lang.String</code>.
     * 
     * @return The unserilized representation of this object as a <code>java.lang.String</code>.
     */
   public String toString()
    {
	StringBuilder sb = new StringBuilder();

	sb.append(this.getClass());
	sb.append(" this.radius=").append(this.radius);

	return sb.toString();
    }
}
