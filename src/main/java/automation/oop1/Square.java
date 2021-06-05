package automation.oop1;

public class Square extends Rectangle {

	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {

		if (side > 0) {
			this.side = side;
		}
	}

	@Override
	public double getArea() {

		return side * side;
	}

	@Override
	public int getLargeSide() {
		return side;
	}

	@Override
	public void setLargeSide(int largeSide) {

		if (largeSide > 0) {
			this.side = largeSide;
		}
	}

	@Override
	public int getSmallSide() {
		return side;
	}

	@Override
	public void setSmallSide(int smallSide) {

		if (smallSide > 0) {
			this.side = smallSide;
		}
	}

	@Override
	public String draw() {
		return "drawing a square";
	}

	@Override
	public String toString() {
		return " The side lenght is: " + side;
	}
}
