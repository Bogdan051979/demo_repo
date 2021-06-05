package exercitii.webExercise1;

import java.util.ArrayList;
import java.util.List;

public class Building1 {

	private List<Entrance> entrance = new ArrayList<Entrance>();
	private List<Floors> floor = new ArrayList<Floors>();
	private List<Apart> apartment = new ArrayList<Apart>();
	private Entrance e, f, g, h;
	private Floors f1, f2, f3;

	public Building1() {
		entrance.add(e);
		entrance.add(f);
		entrance.add(g);
		entrance.add(h);

	}

	@Override
	public String toString() {
		return "The building has " + entrance.size() + " entrances and ";
	}
}
