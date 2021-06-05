package exercitii.webExercise;

public enum Item {
	// Three Items with descriptions
	GOLD(2, "gold"), SILVER(12, "silver"), BRONZE(5, "bronze");

	private int weight;
	private String description;

	private Item(int weight, String description) {
		this.description = description;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return description;
	}
}
