package exercitii.interfaces;

public class Fish implements Animal {
	@Override
	public void move() {
		System.out.println("Swimming...");
	}

	@Override
	public void action() {
		System.out.println("Wings...");
	}

}
