package exercitii.polymorphism;

public class Shape1 {
	/** private member variable */
	private String color;

	/** Construct a Shape instance with the given color */
	public Shape1(String color) {
		this.color = color;
	}

	/** return a self descriptive string */
	@Override
	public String toString() {
		return "Shape1[color=" + color + "]";

	}

	public double getArea() {
		System.err.println("Shape unknown!Cannot compute area!");
		return 0;
	}

}
