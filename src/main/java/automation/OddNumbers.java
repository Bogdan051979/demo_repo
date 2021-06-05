package automation;

public class OddNumbers {

	public static void main(String[] args) {

		int valueToEvaluate = Integer.parseInt(args[0]);

		boolean isOddNum = isOddNumber(valueToEvaluate);// boolean x = isOddNumber(5);

		System.out.println(isOddNum);
	}

	public static boolean isOddNumber(int number) {

		// boolean result = false;

		if (number % 2 == 0) {
			return false; // result = false;
		} // else {
		return true; // result = true;
		// }

		// return result;

	}
}
