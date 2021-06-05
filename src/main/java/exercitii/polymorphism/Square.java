
package exercitii.polymorphism;

public class Square extends Rectangle {
	double side = width = length;

	/** construct a Square instance */
	public Square() {
		super();
	}

	/** construct a Square instance with the given side */
	public Square(double side) {
		super();

		this.side = side;
	}

	/** construct a Square instance with the given side,color and filled */
	public Square(double side, String color, boolean filled) {
		this.side = side;
		this.color = color;
		this.filled = filled;
	}

	/** return side */
	public double getSide() {
		return this.side;
	}

	/** sets side */
	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void setWidth(double side) {
		this.width = side;
	}

	@Override
	public void setLength(double side) {
		this.length = side;
	}

	@Override
	public String toString() {
		return "Square[Rectangle[Shape[color=" + color + ", " + "filled=" + filled + ", " + "width=" + width + ", " + "length="
				+ length + "]]";
	}

}
