package exercitii.polymorphism;

public class Circle extends Shape {
	protected double radius;

	/** construct a Circle instance with default inputs */
	public Circle() {
		super();
		this.radius = 1.0;
	}

	/** construct a Circle instance with the given radius */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	/** construct a Circle instance with the given radius, color and filled */
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	/** returns the radius */
	public double getRadius() {
		return this.radius;
	}

	/** sets the radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** return a self descriptive String */
	@Override
	public String toString() {
		return "Circle[ Shape[color=" + color + ", " + "filled=" + super.isFilled() + "]" + "," + "radius=" + radius + "]";
	}
}
