package exercitii.interfaces.movable;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
	}

	/** construct a MovableCircle instance with the given inputs */
	public MovableCircle(MovablePoint center, int radius) {
		this.radius = radius;
		this.center = center;

	}

	/** returns a self descriptive string */
	@Override
	public String toString() {
		return center.toString() + "," + "radius=" + radius;

	}

	@Override
	public void moveUp() {

	}

	@Override
	public void moveDown() {
	}

	@Override
	public void moveLeft() {
	}

	@Override
	public void moveRight() {
	}
}
