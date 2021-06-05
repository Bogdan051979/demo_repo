package exercitii.homework2;

import java.util.Map;

public class Building {
	private int numberOfFloors;
	private String name = "SkyTech";

	Map<String, String> floors;

	public String getName() {
		return this.name;
	}

	public int getNumberOfFloors() {

		return numberOfFloors;

	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		int numberOfFloors = this.floors.size();
		String floorDetails = "";
		for (String floor : floors.values()) {
			floorDetails += floor.toString();
		}
		return "Building " + this.name + "has " + this.floors.size() + " floors";
	}
}
