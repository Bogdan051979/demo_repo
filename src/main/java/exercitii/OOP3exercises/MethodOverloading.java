package exercitii.OOP3exercises;

public class MethodOverloading {

	public static int average(int n1, int n2) {
		System.out.println("run version 1");
		return (n1 + n2) / 2;
	}

	public static double average(double n1, double n2) {
		System.out.println("run version 2");
		return (n1 + n2) / 2;
	}

	public static int average(int n1, int n2, int n3) {
		System.out.println("run version 3");
		return (n1 + n2 + n3) / 3;
	}

	public static void main(String[] args) {
		System.out.println(average(1, 2));
		System.out.println(average(2.2, 3.3));
		System.out.println(average(2, 3, 5));
		System.out.println(average(1.5, 2)); // int 2 is implicity casted to double 2.0
	}

}
