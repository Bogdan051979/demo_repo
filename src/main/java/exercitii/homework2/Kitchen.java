package exercitii.homework2;

public class Kitchen {
	private int kitchenNumber;

	CoffeeMachine coffeeMachine = new CoffeeMachine();
	WaterDispencer waterDispencer = new WaterDispencer();
	Fridge fridge = new Fridge();

	public Kitchen(int kitchenNumber) {
		this.setKitchenNumber(kitchenNumber);
	}

	public int getKitchenNumber() {
		return kitchenNumber;
	}

	public void setKitchenNumber(int kitchenNumber) {
		this.kitchenNumber = kitchenNumber;
	}

}
