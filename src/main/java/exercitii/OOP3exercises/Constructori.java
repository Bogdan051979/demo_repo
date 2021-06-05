package exercitii.OOP3exercises;

public class Constructori {

	public static void main(String[] args) {

		// Person A; definire obiect
		// apeleaza constructor in clasa Person
		Person A = new Person(42, "Bogdan", "Ardelean");// A reprezinta instanta clasei Person
		Person B = new Person();

		System.out.println("This person  " + A.fname + " has " + A.age + " years old.");
		System.out.println("This person " + B.fname + " has " + B.age + " years old.");
		System.out.println(A);
		System.out.println(B);
	}

}
