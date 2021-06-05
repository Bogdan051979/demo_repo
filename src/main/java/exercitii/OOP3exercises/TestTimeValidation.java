package exercitii.OOP3exercises;

public class TestTimeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeValidation t1 = new TimeValidation();
		System.out.println("time is : " + t1);
		TimeValidation t2 = new TimeValidation(89, 74, 13);
		System.out.println("for t2 the time is: " + t2);
		t1.setHour(15);
		t1.setMinute(59);
		t1.setSecond(58);
		System.out.println(t1.toString());

		System.out.println("the hour is: " + t1.getHour());
		t2.setHour(25);
		System.out.println(t2);
	}

}
