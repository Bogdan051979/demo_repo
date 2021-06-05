package exercitii.webExercise3;

public class Space extends Building {

	public enum SpaceType {
		OFFICE, //
		TOILET, //
		KITCHEN, //
		CONFERENCE_ROOM;
	}

	private SpaceType spaceRoom;

	Floor floor;

	public SpaceType getSpaceRoom() {
		return spaceRoom;
	}

	public void setSpaceRoom(SpaceType spaceRoom) {
		this.spaceRoom = spaceRoom;
	}

	@Override
	public String toString() {
		String result = "" + floors.keySet() + "";
		return result;
	}

}
