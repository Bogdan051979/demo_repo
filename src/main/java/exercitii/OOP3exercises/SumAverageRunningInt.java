package exercitii.OOP3exercises;

public class SumAverageRunningInt {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		double average;
		final int LOWERBOUND = 111;// lowerbound is 1
		final int UPPERBOUND = 8899;// upperbound is 100

		// Modify the program to sum from 111 to 8899, and compute the average.
		// Introduce an int variable called count to count the numbers in the specified range
		// (to be used in computing the average).
		// for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
		// sum += number;
		// count++;
		// }
		// average = (double) sum / count;
		// System.out.println(sum);
		// System.out.println(average);
		// System.out.println(count);

		// FOR-LOOP
		// for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
		// sum = sum + number;// sum+ = number;
		// } average = (double) sum / 100;
		// System.out.println(sum);
		// System.out.println(average);

		// WHILE-DO LOOP

		// int number = LOWERBOUND;
		// while (number <= UPPERBOUND) {
		// sum += number;
		// number++;
		// }
		// average = (double) sum / 100;
		// System.out.println(sum);
		// System.out.println(average);

		// DO-WHILE LOOP
		// int number = LOWERBOUND;
		// do {
		// sum += number;
		// number++;
		// } while (number <= UPPERBOUND);
		// average = (double) sum / 100;
		// System.out.println(sum);
		// System.out.println(average);
	}

}
