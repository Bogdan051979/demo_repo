package automation.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ExampleOfList {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add("Four");
		System.out.println(listStrings);

		List<String> listString = new LinkedList<String>();
		listString.add("Five");
		listString.add("Six");
		listString.add("Seven");
		listString.add("Eight");
		System.out.println(listString);
		System.out.println(listString.size());

		List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 8, 989);
		List<Integer> myNumbers = new ArrayList<>(numbers);
		myNumbers.add(1);
		System.out.println(numbers);
		System.out.println(myNumbers);

		Set<String> names = new HashSet<>();
		names.add("Crina");
		names.add("Tiberiu");
		names.add("Laura");
		names.add("Bobby");
		System.out.println(names);
		Set<String> myNames = new LinkedHashSet<>();
		myNames.add("Crina");
		myNames.add("Tiberiu");
		myNames.add("Laura");
		myNames.add("Bobby");
		System.out.println(myNames);

	}

}
