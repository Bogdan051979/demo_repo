
package automation;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");

		a = scanner.nextDouble();
		System.out.print("Enter second number:");
		b = scanner.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next()
				.charAt(0);

		scanner.close();
		double result;

		switch (operator) {
		case '+':
			result = a + b;
			break;

		case '-':
			result = a - b;
			break;

		case '*':
			result = a * b;
			break;

		case '/':
			result = a / b;
			break;

		default:
			System.out.printf("You have entered wrong operator");
			return;
		}

		System.out.println(a + " " + operator + " " + b + ": " + result);
	}
}
