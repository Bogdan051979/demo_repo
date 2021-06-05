package exercitii.webExercise1;

public class Building {
	private int numberOfFloors;
	private int numberOfWindows;

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getNumberOfWindows() {
		return numberOfWindows;
	}

	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}

	@Override
	public String toString() {
		String result = "I am a Building!";
		return result;
	}

}
