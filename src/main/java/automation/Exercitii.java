package automation;

public class Exercitii {

	public static void main(String[] args) {

		int sum = 0;// echivalent cu int sum;
		boolean isOddNum;

		for (int i = 1; i < 100; i++) {
			sum = sum + i;// sum+=i;
			System.out.println("Suma intermediara este " + sum);
		}
		System.out.println(sum);
		isOddNum = OddNumbers.isOddNumber(sum);
		System.out.println(isOddNum);
	}

}
