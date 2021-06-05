package exercitii.OOP3exercises;

/** a cylinder is a circle plus a height */

public class Cylinder extends MyCircle {
	private double height;

	public Cylinder() {
		super();// invoke superclass's constructor MyCircle()
		this.height = 1.0;
	}

	public Cylinder(double height) {
		super();// invoke superclass's constructor MyCircle()
		this.height = height;
	}

	public Cylinder(double height, double radius) {
		super(radius);// invoke superclass's constructor MyCircle(radius)
		this.height = height;

	}

	public Cylinder(double height, double radius, String color) {
		super(radius, color);
		this.height = height;

	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/** returns a self descriptive string */

	// public String toString() {
	// return "This is a cylinder";
	// }

	// /** returns the volume of the cylinder */
	// public double getVolume() {
	// return getArea() * height;
	// }

	/** override the getArea()method inherited from superclass MyCircle */
	@Override
	public double getArea() {
		return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
	}

	// Need to change the getVolume() as well
	public double getVolume() {
		return super.getArea() * height; // use superclass' getArea()
	}

	@Override
	public String toString() {
		return "Cylinder [ " + super.toString() + " ,height=" + height + " ]";
	}

}
