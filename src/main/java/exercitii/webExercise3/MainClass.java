
package exercitii.webExercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Plz enter Name : ");
		input.nextLine();
		System.out.println("Plz enter Address : ");
		input.nextLine();
		System.out.println("Plz enter ContactNumber : ");
		input.nextLine();

		ArrayList<Data> contactsList = new ArrayList<Data>();
		Data object = new Data();
		contactsList.add(object);
		System.out.println(object.printData());
	}
}
