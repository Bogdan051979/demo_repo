package exercitii.OOP3exercises;

public class CircleFirst {

	// public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";

	// private instance variables
	private double radius;
	private String color;

	// the overloaded constructors
	// constructs a CircleFirst with default radius and color
	public CircleFirst() {// 1st constructor
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}

	// constructs a CircleFirst with the given radius and default color
	public CircleFirst(double radius) {// 2nd constructor
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}

	// construct a CircleFirst with the given radius and color

	public CircleFirst(double radius, String color) { // 3rd constructor
		this.radius = radius;
		this.color = color;
	}

	// returns the radius - the public getter for private variable radius

	public double getRadius() {
		return this.radius;
	}

	// set the radius - the public setter for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// returns the color - the public getter for private variable color
	public String getColor() {
		return this.color;
	}

	// set the color - the public setter for private variable color
	public void setColor(String color) {
		this.color = color;
	}

	// returns a self-descriptive string for this CircleFirst instance
	@Override
	public String toString() {
		return "CircleFirst[radius=" + radius + " ,color=" + color + "]";
	}

	// returns the area of this CircleFirst
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// return the circumference of this CircleFirst
	public double getCircumference() {
		return 2.0 * radius * Math.PI;
	}

}
