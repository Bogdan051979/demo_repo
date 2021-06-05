package exercitii.OOP3exercises;

public class Person {
	int age;
	String fname;
	String lname;

	Person() {
		age = 25;
		fname = "Unknown";
		lname = null;
	}

	Person(int age, String fname) {
		this.age = age;
		this.fname = fname;
	}

	Person(int age, String fname, String lname) {
		this.age = age;
		this.fname = fname;
		this.lname = lname;

	}

	@Override
	public String toString() {
		return "This person's name is: " + this.fname + " " + this.lname + " and he/she is " + this.age + " years old";
	}
}
