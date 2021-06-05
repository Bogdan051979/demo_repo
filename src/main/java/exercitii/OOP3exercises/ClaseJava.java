package exercitii.OOP3exercises;

public class ClaseJava {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Integer x = new Integer(25);
		int y = 0;

		System.out.println(x.toString() + " ani");
		System.out.println(y);

		String a = new String("abcdef");
		String b = a.substring(0, 3);

		System.out.println(a + " vs. " + b);

		ClasaMea ob1 = new ClasaMea();

		ob1.x = 10;
		ob1.a = "Bogdan";

		System.out.println(ob1.numeleMeu(ob1.a) + " numarul este: " + ob1.x);
	}

}
