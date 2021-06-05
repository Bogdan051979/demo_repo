package exercitii.OOP3exercises;

public class MyCircle {

	/* *private variables */
	private double radius;
	private String color;

	/* Constructors */
	/** default constructor */
	public MyCircle() {
		this.radius = 1.0;
		this.color = "red";

	}

	/** a constructor with a given radius and default color */
	public MyCircle(double radius) {
		this.radius = radius;
		this.color = "red";
	}

	/**
	 * constructor with the given radius and color
	 */
	public MyCircle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	/** return radius */
	public double getRadius() {
		return this.radius;
	}

	/** set radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** return color */
	public String getColor() {
		return this.color;
	}

	/** set color */
	public void setColor(String color) {
		this.color = color;
	}

	/** self descriptive String */
	@Override
	public String toString() {
		return "Circle [radius = " + radius + ", color =" + color + "]";
	}

	/** return the area */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
