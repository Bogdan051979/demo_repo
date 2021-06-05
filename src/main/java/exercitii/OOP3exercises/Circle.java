package exercitii.OOP3exercises;

// The Circle class models a circle with a radius and color;
public class Circle {// save as "Circle.java"
	// private instances variables
	private double radius = 1.0;
	private String color = "red";

	// constructors(overloaded)
	// construct a Circle instance with default radius and color
	public Circle() {// 1st Constructor(default constructor)
		radius = 1.0;
		color = "red";
	}

	// constructs a Circle instance with the given radius and default color;
	public Circle(double r) {// 2nd Constructor
		radius = r;
		color = "red";
	}

	// constructs a Circle instance with the given radius and color
	public Circle(double r, String c) {// 3rd Constructor
		radius = r;
		color = c;
	}

	// public methods
	// returns the radius
	public double getRadius() {// getter for radius
		return radius;
	}

	// returns the color
	public String getColor() {// getter for color
		return this.color;
	}

	// returns the area of this circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle[radius=" + radius + ",color=" + color + "]";
	}

}
