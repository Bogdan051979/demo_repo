package exercitii.webExercise;

public class TestItem {

	public static void main(String[] args) {

		for (Item item : Item.values()) {
			System.out.println(item.getWeight() + " is the weight of " + item.name());
		}

	}

}
