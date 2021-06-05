package exercitii.webExercise3;

import java.util.HashMap;
import java.util.Map;

public class Building {

	private String name = "SkyNet";
	private int numberOfFloors;

	Map<Integer, String> floors = new HashMap<>();

	public Building() {

		floors.put(1, "FLOOR1");
		floors.put(2, "FLOOR2");
		floors.put(3, "FLOOR3");

	}

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
		return "Building " + name + " has " + floors.size() + " floors" + "\n\t" + floors.get(1) + ":";
	}

}
