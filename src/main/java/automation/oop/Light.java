package automation.oop;

public class Light {

	private boolean isOn;
	private byte intensity = 10;

	public void turnOn() {
		this.isOn = true;

	}

	public void turnOff() {
		this.isOn = false;

	}

	public boolean isOn() {
		return isOn;
	}

	// public void setIntensity(byte intensity) {
	//
	// if (intensity < 0 || intensity > 10) {
	// return;
	// }
	// this.intensity = intensity;

	public void dim() {
		if (intensity > 0) {
			intensity--;

			if (intensity == 0) {
				turnOff();
			}
		}
	}

	public void brighten() {
		if (intensity < 10) {
			intensity++;

			if (intensity == 1) {
				turnOn();
			}
		}

	}

	public byte getIntensity() {
		return intensity;
	}

}
