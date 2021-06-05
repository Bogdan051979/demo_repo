package automation;

import java.util.Scanner;

public class MonthOfFebruary {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in)) {
			System.out.print("Introduceti anul:");
			int year = input.nextInt();

			if ((year > 1900) && (year < 2016)) {

				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

					System.out.print("Februarie are 29 de zile");
				} else {
					System.out.print("Februarie are 28 de zile");
				}

			} else {
				System.out.print("Anul nu este valid");
			}
		}

	}
}
