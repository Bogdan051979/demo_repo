package exercitii.memberVariables;

public class Circle {
	/** private member variables */
	private double radius;
	private String color;

	/** construct a Circle instance with default inputs */
	public Circle() {
		this.radius = 1.0;
		this.color = "red";

	}

	/** construct a Circle instance with the given radius and default color */
	public Circle(double r) {
		this.radius = r;
		this.color = "red";
	}

	/** construct a Circle instance with the given radius and color */
	public Circle(double r, String color) {
		this.radius = r;
		this.color = color;
	}

	public double getRadius() {
		return this.radius;
	}

	public String getColor() {
		return this.color;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

}
