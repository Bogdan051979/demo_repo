package exercitii.inheritance;

public class FireTruck extends Truck {
	public FireTruck() {
		int hp = 5500;
		length = 28;
		height = 12;
		enginePower = 2000;
	}

	public void blowWater() {
		System.out.println("Blow");
	}

}
