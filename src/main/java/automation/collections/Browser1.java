package automation.collections;

import java.util.Arrays;
import java.util.List;

public enum Browser1 {
	CHROME("77", "88", "99"), //
	FIREFOX("5.32.43", "6", "7"), //
	IE("993"), //
	OPERA("978234.3");

	private List<String> versions;

	Browser1(String... versions) // putem avea 0 sau mai multe argumente de acest fel
	{
		this.versions = Arrays.asList(versions);// Arrays.asList este metoda STATICA
	}

	public List<String> getVersions() {
		return versions;
	}

}
