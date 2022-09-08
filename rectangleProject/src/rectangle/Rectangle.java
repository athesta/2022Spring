package rectangle;

public class Rectangle {

	//Instance Constants
	private static final double DEFAULT_WIDTH 	= 5.0;
	private static final double DEFAULT_LENGTH 	= 5.0;
	
	//Instance variables
	private double width;
	private double length;
	private double area;
	
	/*
	 * Methods
	 */
	//Public method initRect that takes as input a width 
	//and height and sets the corresponding member values 
	//to these values—the method returns nothing
	public Rectangle(double w, double l) {
		this.width  = w;
		this.length = l;
	}
	
	public Rectangle(double w) {
		this.width  = w;
		this.length = DEFAULT_LENGTH;
	}
	
	public Rectangle() {
		this(DEFAULT_WIDTH,DEFAULT_LENGTH);
	}
	
	//copyConstructor
	public Rectangle(Rectangle rect) {
		this.width  = rect.width;
		this.length = rect.length;
	}
	
	//Public method computeArea that computes area and saves it as the variable area
	public void computeArea() {
		this.area = width*length;
		}

	//Public method getArea that returns the area of the object
	public double getArea() {
		return this.area;
	}
	
	//Public method setWidth that sets the width of the 
	//object to the corresponding value supplied by the input paramete
	public void setWidth(double w) {
		 this.width=w;
	}
	
	//Public method setLength that sets the length of 
	//the object to the corresponding value supplied by the input parameter
	public void setLength(double l) {
		l = this.length;
	}
	
	public String toString() {
		return String.format("The area is %.2f", area);
	}
	
}
