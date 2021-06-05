package automation.oop;

public class OverloadMethod {

	public static void overloadMethod() {
		System.out.println("overloadMethod whit no arguments");

	}

	public static void overloadMethod(int i) {
		System.out.println("overloadMethod with an int argument having value " + i);
	}

	public static void overloadMethod(String s) {
		System.out.println("overloadMethod with a String argument having value " + s);
	}

	public static void overloadMethod(String s, boolean b) {
		System.out.println("overloadMethod with a String and boolean arguments having values " + s + " and " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadMethod();
		overloadMethod(5);
		overloadMethod("blue");
		overloadMethod("red", true);

	}

}
