package exercitii.OOPLearning;

public class LampTest {

	public static void main(String[] args) {
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();

		/**
		 * turn on the light by calling method turnOn()
		 */
		led.turnOn();

		/**
		 * turn off the light by calling the method turnOff()
		 */
		halogen.turnOff();
	}

}
