package exercitii.homework2;

import java.util.HashMap;

public class TestBuilding {

	public static void main(String[] args) {

		Building building = new Building();

		HashMap<Integer, Floor> floors = new HashMap<>();
		Floor f1 = new Floor();
		floors.put(1, f1);
		Floor f2 = new Floor();
		floors.put(2, f2);
		Floor f3 = new Floor();
		floors.put(3, f3);

		System.out.println(building.toString());

	}
}