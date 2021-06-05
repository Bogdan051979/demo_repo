package exercitii.OOP3exercises;

public class Persons {
	private String name;
	private int age;

	public Persons() {
		this.name = "Bobby";
		this.age = 42;
	}

	public void talk() {

	}

	public void walk() {

	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age < 18 || age > 55) {
			System.out.println("Age must be between 18 and 55.");
		} else {
			System.out.println("Congratulation!!You are addmited.");
		}
		this.age = age;
	}

}
