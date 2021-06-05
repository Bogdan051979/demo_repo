package exercitii.OOP3exercises;

// A test driver for the Circle class
public class TestCircle {// save as TestCircle.java

	public static void main(String[] args) {// program entry point
		// Declare and Construct an instance of the Circle class called c1
		Circle c1 = new Circle(2.0, "blue");// use 3rd constructor
		System.out.println("The radius is: " + c1.getRadius());// use dot(.) operator to invoke member methods
		System.out.println("The color is: " + c1.getColor());
		System.out.println("The area is : " + c1.getArea());

		// Declare and Construct another instance of the Circle class called c2
		Circle c2 = new Circle(2.0);// use 2nd constructor
		System.out.println("The radius is : " + c2.getRadius());
		System.out.println("The color is : " + c2.getColor());
		System.out.println("The area is :" + c2.getArea());

		// Declare and Construct yet another instance of the Circle class called c3
		Circle c3 = new Circle();// use 1st constructor
		System.out.println("The radius is:" + c3.getRadius());
		System.out.println("The color is: " + c3.getColor());
		System.out.println("The area is: " + c3.getArea());

		Circle c4 = new Circle();
		System.out.println(c4.toString());
		System.out.println(c4);
		System.out.println("c4 is: " + c4);
	}

}
