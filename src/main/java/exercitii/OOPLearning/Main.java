package exercitii.OOPLearning;

public class Main {
	// creating a method
	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {

		int num1 = 25;
		int num2 = 15;

		Main obj = new Main();
		int result = obj.addNumbers(num1, num2);

		System.out.println("The sum is " + result);

	}
}
