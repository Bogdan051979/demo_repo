package exercitii.webExercise1;

public class Room {
	private int length;
	private int width;
	private String floorCovering;
	private int numberOfClosets;

	public Room(int length, int width, String floorCovering, int numberOfClosets) {
		this.length = length;
		this.width = width;
		this.floorCovering = floorCovering;
		this.numberOfClosets = numberOfClosets;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getFloorCovering() {
		return floorCovering;
	}

	public void setFloorCovering(String floorCovering) {
		this.floorCovering = floorCovering;
	}

	public int getNumberOfClosets() {
		return numberOfClosets;
	}

	public void setNumberOfClosets(int numberOfClosets) {
		this.numberOfClosets = numberOfClosets;
	}

	@Override
	public String toString() {
		String result = "\n\t\tLength: " + this.getLength() + " Width: " + this.getWidth() + " Closets: " + this.getNumberOfClosets()
				+ " Floor Covering: " + this.getFloorCovering();
		return result;
	}

}
