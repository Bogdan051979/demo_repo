package exercitii.OOPLearning;

public class Lamp {
	boolean isOn;

	/**
	 * method to turn on the light
	 */
	public void turnOn() {
		isOn = true;
		System.out.println("Light is on? " + isOn);
	}

	/**
	 * method to turn off the light
	 */

	public void turnOff() {
		isOn = false;
		System.out.println("Light is on? " + isOn);
	}

}
