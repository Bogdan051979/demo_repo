package exercitii.OOP3exercises;

public class Square {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {

		if (side < 0) {
			System.err.print("The side cannot be negative");
			return;
		}

		this.side = side;
	}

}
