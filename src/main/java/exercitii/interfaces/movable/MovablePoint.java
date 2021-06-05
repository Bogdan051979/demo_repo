package exercitii.interfaces.movable;

public class MovablePoint implements Movable {
	/** package variable */
	int x, y, xSpeed, ySpeed;

	/** construct a MovablePoint instance with the given inputs */
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	/** returns a self descriptive string */
	@Override
	public String toString() {
		return "(" + x + "," + y + ")" + "," + "speed=" + "(" + x + "," + y + ")";
	}

	@Override
	public void moveUp() {
		y -= ySpeed;

	}

	@Override
	public void moveDown() {
		y += ySpeed;
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		x += xSpeed;
	}

}
