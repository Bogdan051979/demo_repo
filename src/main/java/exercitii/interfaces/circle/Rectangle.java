package exercitii.interfaces.circle;

public class Rectangle implements GeometricObject {
	/** private member variable */
	private double width;
	private double length;

	/** construct a Rectangle instance with the given width and length */
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	/** self descriptive string */
	@Override
	public String toString() {
		return "Rectangle[width=" + width + ", " + "length=" + length + "]";
	}

	/** override the getArea() from interface */
	@Override
	public double getArea() {
		return width * length;
	}

	/** override the getPerimeter() from interface */
	@Override
	public double getPerimeter() {
		return width + width + length + length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

}
