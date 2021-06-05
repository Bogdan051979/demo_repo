package exercitii.OOPLearning;

//Default Constructor
/**
 * If we do not create any constructor, the Java compiler automatically create a no-arg constructor during the execution of the program. This constructor is called default constructor.
 */
public class Main7 {
	int a;
	boolean b;

	public static void main(String[] args) {
		Main7 m = new Main7();

		System.out.println("default value: ");
		System.out.println("a = " + m.a);
		System.out.println("b = " + m.b);

	}

}
