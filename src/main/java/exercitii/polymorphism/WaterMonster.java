package exercitii.polymorphism;

public class WaterMonster extends Monster {

	/** Construct a WaterMonster instance with the given name */
	public WaterMonster(String name) {
		super(name);
	}

	/** subclass provide actual implementation */
	@Override
	public String attack() {
		return "Attack with water";
	}

}
