package exercitii.webExercise1;

public class Floors {

	private int floorNumber;
	private int numberOfDesks;

	public int getFloorNumber() {
		return floorNumber;
	}

	public int getNumberOfDesks() {
		return numberOfDesks;
	}

	public void setNumberOfDesks(int numberOfDesks) {
		this.numberOfDesks = numberOfDesks;
	}

	@Override
	public String toString() {
		return "Desks are " + numberOfDesks;
	}
}
