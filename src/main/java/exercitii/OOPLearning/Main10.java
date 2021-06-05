package exercitii.OOPLearning;

import java.util.ArrayList;
import java.util.List;

public class Main10 {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("horse");

		System.out.println("the list is: " + animals);
		String removed = animals.remove(2);
		System.out.println("update list is " + animals);
		System.out.println("removed animal is " + removed);

	}
}
