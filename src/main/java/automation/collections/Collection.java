package automation.collections;

import java.util.ArrayList;
import java.util.List;

import automation.oop1.Circle;

public class Collection {
	public static void main(String[] args) {
		parameterList();
		rawList();

	}

	public static void parameterList() {

		Circle circle = new Circle();
		circle.setColor("blue");

		List<Circle> list = new ArrayList<Circle>(2);

		list.add(circle);
		list.add(new Circle());
		list.add(circle);
		list.add(new Circle());

		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

	}

	public static void rawList() {
		List list = new ArrayList();

		list.add("list element");
		list.add("another list element");
		list.add(7);
		list.add(new Circle());

		Object secondElement = list.get(3);
		if (secondElement instanceof String) {

			String firstElement = (String) secondElement;
			String firstSub = firstElement.substring(3);
			System.out.println(firstSub);

		} else if (secondElement instanceof Circle) {

			Circle firstElement = (Circle) secondElement;
			System.out.println(firstElement.draw());

		}

	}
}
