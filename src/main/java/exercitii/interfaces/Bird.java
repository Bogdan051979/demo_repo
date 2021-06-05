package exercitii.interfaces;

public class Bird implements Animal {
	@Override
	public void move() {
		System.out.println("Flying ....");
	}

	@Override
	public void action() {
		System.out.println("Lays egg...");
	}

}
