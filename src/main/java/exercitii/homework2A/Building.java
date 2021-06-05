package exercitii.homework2A;

public class Building {

	private String name;

	Floor floor;

	public Building() {
		this.name = "SkyTech";
	}

	public Building(Floor floor) {
		this.floor = floor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "\nBuilding " + name + " has " + Floor.values().length + " floors";
	}

}
