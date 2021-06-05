package exercitii.polymorphism;

public class Rectangle1 extends Shape1 {
	/** private member variables */
	private int length;
	private int width;

	/** construct a Rectangle instance with the given color, length and width */
	public Rectangle1(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	/** override the inherited getArea() to provide proper implementation to rectangle1 */
	@Override
	public double getArea() {
		return length * width;
	}

	/** returns a self descriptive string */
	@Override
	public String toString() {
		return "Rectangle[length=" + length + ", " + "width=" + width + ", " + super.toString() + "]";
	}

}
