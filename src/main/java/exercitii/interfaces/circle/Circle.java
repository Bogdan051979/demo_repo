package exercitii.interfaces.circle;

public class Circle implements GeometricObject {

	/** private member variable */
	private double radius;

	/** construct a Circle instance with the given radius */
	public Circle(double radius) {
		this.radius = radius;
	}

	/** self descriptive string */
	@Override
	public String toString() {
		return "Circle [ radius= " + radius + "]";
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2.0 * radius * Math.PI;
	}

	public double getRadius() {
		return this.radius;
	}

}
