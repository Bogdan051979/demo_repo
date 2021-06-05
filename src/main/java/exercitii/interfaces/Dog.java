package exercitii.interfaces;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("Running...");
	}

	@Override
	public void action() {
		System.out.println("Eat...");
	}

}
