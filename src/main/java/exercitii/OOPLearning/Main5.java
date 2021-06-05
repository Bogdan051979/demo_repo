package exercitii.OOPLearning;

public class Main5 {
	int i;

	private Main5() {
		this.i = 5;
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {
		Main5 m = new Main5();
		System.out.println("value of i : " + m.i);
	}

}
