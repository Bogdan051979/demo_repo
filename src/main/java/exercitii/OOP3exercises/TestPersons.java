package exercitii.OOP3exercises;

public class TestPersons {

	public static void main(String[] args) {
		Persons p1 = new Persons();

		System.out.println(p1.getName());
		System.out.println("The name is " + p1.getName() + " and he has " + p1.getAge() + " years old.");

		p1.setAge(25);
		System.out.println("He was " + p1.getAge() + " years old when he was in USA.");

	}

}
