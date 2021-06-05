package exercitii.webExercise;

import java.util.HashMap;
import java.util.Map;

public class Character {
	public String name;

	private Map<String, String> stats = new HashMap<>();

	public Character(String charName) {
		name = charName;

		stats.put("Strength", "5");
		stats.put("Dexterity", "5");
		stats.put("Constitution", "5");
		stats.put("Intelligence", "5");
		stats.put("Strength", "5");
		stats.put("Wisdom", "10");
	}

	public String getStat(String name) {

		return stats.get(name);
	}
}
