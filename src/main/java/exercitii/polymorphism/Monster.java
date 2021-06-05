package exercitii.polymorphism;

public class Monster {
	/** private member variable */
	private String name;

	/** construct a Monster instance with the given name */
	public Monster(String name) {
		this.name = name;
	}

	/** defines a common behavior called attack() for all its classes */
	public String attack() {
		System.err.println("I don't know how to attack");
		return "I don't know how to attack";
	}

}
