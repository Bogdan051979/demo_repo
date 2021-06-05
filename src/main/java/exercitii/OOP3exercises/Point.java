package exercitii.OOP3exercises;

public class Point {
	/** private instance variable */
	int x;
	int y;

	/** construct a Point instance with default inputs */
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	/** construct a Point instance with the given inputs */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/** return the value of x */
	public int getX() {
		return this.x;
	}

	/** set the value of x */
	public void setX(int x) {
		this.x = x;
	}

	/** return the value of y */
	public int getY() {
		return this.y;
	}

	/** sets the value of y */
	public void setY(int y) {
		this.y = y;
	}

	/** self descriptive string to return (x,y) */
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	/** return a 2-element int array{x,y} */
	public int[] getXY() {
		int[] results = new int[2];
		results[0] = this.x;
		results[1] = this.y;
		return results;
	}

	/** sets both x and y */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/** returns the distance from this instance to the given point at (x,y).invoke via p1.distance(1,2) */
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	/** returns the distance from this instance to the given Point instance.Invoke via p1.distance(p2) */
	public double distance(Point another) {
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	/** returns the distance from this instance to (0,0).Invoke via p1.distance() */
	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);

	}

}
