package exercitii.inheritance;

public class Point2D {
	/** Private instance variables */
	private int x, y;

	/** Construct a Point2D instance with default variables */
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	/** Construct a Point2D instance with the given atributes */
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/** return x */
	public int getX() {
		return this.x;
	}

	/** sets x */
	public void setX(int x) {
		this.x = x;
	}

	/** return y */
	public int getY() {
		return this.y;
	}

	/** set y */
	public void setY(int y) {
		this.y = y;
	}

	/** return a self descriptive String in the form of "(x,y)" */
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}
