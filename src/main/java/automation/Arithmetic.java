package automation;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		if (args.length == 3) {

			double a = Double.parseDouble(args[0]);

			double b = Double.parseDouble(args[2]);

			double result = 0;

			String operator = args[1];

			switch (operator) {

			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;

			case "/":
				result = a / b;
				break;
			default:
				System.out.print("You entered wrong operator");

			}

			// implement calculator logic here

			System.out.println("Result is: " + result);

		} else {

			System.err.println("3 arguments are needed!");

		}

	}
}
