package exercitii.OOP3exercises;

public class TestTime {

	public static void main(String[] args) {
		Time t1 = new Time(1, 2, 13);// use 1st constructor
		System.out.println(t1.toString());
		Time t2 = new Time();// use 2nd constructor
		System.out.println(t2);

		// test setters and getters
		t1.setHour(17);
		t1.setMinute(25);
		t1.setSecond(59);
		System.out.println(t1);
		System.out.println("Hour is :" + t1.getHour());
		System.out.println("Minute is :" + t1.getMinute());
		System.out.println("Second is :" + t1.getSecond());

		// test setTime()
		t1.setTime(59, 59, 23);
		System.out.println("The new hour is: " + t1);

		// test nextSecond() and chaining
		System.out.println("At the next gong the hour is: " + t1.nextSecond());// returns an instance of Time. Invoke Time's toString()
		System.out.println("Now is the end of the new hour :" + t1.nextSecond()
				.nextSecond()
				.nextSecond());// chaining
	}

}
