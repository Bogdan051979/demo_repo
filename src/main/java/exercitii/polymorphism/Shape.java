package exercitii.polymorphism;

public abstract class Shape {
	/** protected member variables */
	protected String color;
	protected boolean filled;

	/** construct a Shape instance with the default inputs */
	public Shape() {
		this.color = "red";
		this.filled = true;
	}

	/** construct a Shape instance with the given attributes */
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/** return the color */
	public String getColor() {
		return this.color;
	}

	/** sets the color */
	public void setColor(String color) {
		this.color = color;
	}

	/** return if it is filled */
	public boolean isFilled() {
		return this.filled;
	}

	/** sets if it is filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + color + ", " + "filled=" + filled + " ]";
	}

}
