package exercitii.polymorphism;

public class StoneMonster extends Monster {
	/** construct a StoneMonster instance with the given name */
	public StoneMonster(String name) {
		super(name);
	}

	/** provide actual implementation for attack() */
	@Override
	public String attack() {
		return "Attack with stone";
	}

}
