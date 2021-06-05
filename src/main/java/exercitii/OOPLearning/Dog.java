package exercitii.OOPLearning;

public class Dog extends Animals {

	@Override
	public void eat() {
		super.eat();
		System.out.println("I eat dog food");
	}

	public void display() {
		System.out.println(" My name is: " + name);
	}
}
