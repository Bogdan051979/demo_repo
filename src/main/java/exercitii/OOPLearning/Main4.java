package exercitii.OOPLearning;
//Java Constructor

public class Main4 {
	private String name;

	// constructor
	public Main4() {
		this.name = "Programiz";
		System.out.println("Constructor Called: ");

	}

	public static void main(String[] args) {
		// constructor is invoked while
		// creating an object of the Main class

		Main4 obj = new Main4();
		System.out.println("The name is " + obj.name);

	}

}
