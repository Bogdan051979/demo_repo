package exercitii.interfaces.movablepoint;

public class MovablePoint implements Movable {
	/** member variable */
	int x;
	int y;
	int xSpeed;
	int ySpeed;

	/** constructs a MovablePoint instance with the given x,y,xSpeed,ySpeed */
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	/** self descriptive string */
	@Override
	public String toString() {
		return "(" + x + ", " + y + ") " + "speed=" + "(" + x + ", " + y + ")";
	}

	/** override moveUp() */
	@Override
	public void moveUp() {
		y -= ySpeed;
	}

	/** override moveDown() */
	@Override
	public void moveDown() {
		y += ySpeed;
	}

	/** override moveLeft() */
	@Override
	public void moveLeft() {
		x -= xSpeed;
	}

	/** override moveRight */
	@Override
	public void moveRight() {
		x += xSpeed;
	}
}
