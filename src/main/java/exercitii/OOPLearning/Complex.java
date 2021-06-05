package exercitii.OOPLearning;

public class Complex {
	private int a, b;

	// constructor with 2 parameters
	private Complex(int i, int j) {
		this.a = i;
		this.b = j;
	}

	// constructor with single parameter
	private Complex(int i) {
		// invokes the constructor with 2 parameters
		this(i, i);
	}

	// constructor with no parameter
	private Complex() {
		this(5);
	}

	@Override
	public String toString() {
		return this.a + " + " + this.b + "i";
	}

	public static void main(String[] args) {
		Complex c1 = new Complex(2, 3);
		Complex c2 = new Complex(4);
		Complex c3 = new Complex();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
