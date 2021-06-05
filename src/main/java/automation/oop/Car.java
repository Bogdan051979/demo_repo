package automation.oop;

public class Car {

	private boolean on;
	private int speed;
	private String direction;

	public boolean getOn() {
		return on;
	}

	public int getSpeed() {
		return speed;
	}

	public String getDirection() {
		return direction;
	}

	public void start() {
		this.on = true;
	}

	public void stop() {
		this.on = false;
	}

	public void accelerate() {
		this.speed++;
	}

	public void turnLeft() {
		this.direction = "Turning Left";

	}

	public void turnRight() {
		this.direction = "Turning Right";
	}
}
