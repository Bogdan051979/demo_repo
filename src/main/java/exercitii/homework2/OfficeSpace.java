package exercitii.homework2;

public class OfficeSpace {
	private int desks;
	private SpaceType spacetype;

	public int getDesks() {
		return desks;
	}

	public void setDesks(int desks) {
		this.desks = desks;
	}

	public enum SpaceType {
		OFFICE, //
		TOILET, //
		KITCHEN, //
		CONFERENCE_ROOM
	}

}
