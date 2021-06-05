package exercitii.OOP3exercises;

public class TestDate {

	public static void main(String[] args) {
		Date d1 = new Date(2021, 12, 01);
		System.out.println(d1.toString());// toString()

		// test setters and getters
		d1.setYear(2022);
		d1.setMonth(07);
		d1.setDay(05);
		System.out.println(d1);
		System.out.println("Year is :" + d1.getYear());
		System.out.println("Month is :" + d1.getMonth());
		System.out.println("Day is :" + d1.getDay());

		// test setDate()
		d1.setDate(2054, 11, 8);
		System.out.println(d1);

		// another instance of Date class
		Date d2 = new Date(1979, 07, 05);
		System.out.println("the bellow example is made by me:");
		System.out.println(d2.toString());// or just (d2)
		// test setters and getters
		d2.setYear(1978);
		d2.setMonth(4);
		d2.setDay(2);
		System.out.println(d2.toString());
		System.out.println("The year is :" + d2.getYear());
		System.out.println("The month is :" + d2.getMonth());
		System.out.println("The day is :" + d2.getDay());

		// test setDate()
		d2.setDate(1989, 12, 16);
		System.out.println(d2);
	}

}
