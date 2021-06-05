package exercitii.homework2B;

import java.util.Map;

public class Building {

	private String name;
	private int numberOfFloors;
	Map<Integer, Floor> floors;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	@Override
	public String toString() {

		int numberOfFloors = this.floors.size();
		String floorDetails = "Details";
		for (Floor floor : floors.values()) {
			floorDetails += floor.toString();
		}
		return "Building " + this.name + " has " + this.floors.size() + "floors";
	}

}
