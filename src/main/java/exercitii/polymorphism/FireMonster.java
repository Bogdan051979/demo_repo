package exercitii.polymorphism;

public class FireMonster extends Monster {
	/** construct a FireMonster instance with the given name */
	public FireMonster(String name) {
		super(name);

	}

	/** override the inherited behavoir */
	@Override
	public String attack() {
		return "Attack with fire";

	}

}
