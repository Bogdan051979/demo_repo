package exercitii.polymorphism;

public class Rectangle extends Shape {

	/** protected member variable */
	protected double width;
	protected double length;

	/** construct a Rectangle instance with default inputs */
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}

	/** construct a Rectangle instance with the given width and length */
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	/** construct a Rectangle instance using the given width, length, color and filled */
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}

	/** return the width */
	public double getWidth() {
		return this.width;
	}

	/** sets the width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** return the length */
	public double getLength() {
		return this.length;
	}

	/** sets the length */
	public void setLength(double length) {
		this.length = length;
	}

	/** override the abstract method getArea() */
	@Override
	public double getArea() {
		return width * length;
	}

	/** override the getPerimeter() */
	@Override
	public double getPerimeter() {
		return width * width + length * length;
	}

	/** return a self descriptive String */
	@Override
	public String toString() {
		return "Rectangle[Shape[color=" + color + ", " + "filled=" + filled + "] " + ", " + "width=" + width + ", " + "length="
				+ length + "]";
	}

}
