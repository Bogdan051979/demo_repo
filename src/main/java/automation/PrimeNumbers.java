package automation;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Prime numbers lower than 1000000 are:");

		for (int i = 0; i <= 1000000; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrimeNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
