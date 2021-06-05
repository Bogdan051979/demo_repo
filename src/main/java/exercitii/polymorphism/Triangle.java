package exercitii.polymorphism;

public class Triangle extends Shape1 {

	/** private member variable */
	private int base;
	private int height;

	/** construct a Triangle instance with the given color,base and height */
	public Triangle(String color, int base, int height) {
		super(color);
		this.height = height;
		this.base = base;
	}

	/** override the inherited getArea() to provide proper implementation for triangle */
	@Override
	public double getArea() {
		return (base * height) / 2;
	}

	/** return a self descriptive string */
	@Override
	public String toString() {
		return "Triangle[base=" + base + ",height=" + height + ", " + super.toString() + "]";
	}

}
