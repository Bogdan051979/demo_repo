package exercitii.OOP3exercises;

public class TestCircleFirst {

	public static void main(String[] args) {
		CircleFirst c1 = new CircleFirst(1.1, "blue");
		System.out.println(c1.toString());// explicitly calling toString() or just (c1)- implicit call to c1.toString()
		CircleFirst c2 = new CircleFirst(2.2);
		System.out.println(c2);
		CircleFirst c3 = new CircleFirst();
		System.out.println(c3);
		System.out.println("c3 is:" + c3);

		// test setters and getters
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println(c1);
		System.out.println("the radius is: " + c1.getRadius());
		System.out.println("the color is: " + c1.getColor());

		c3.setRadius(4.5);
		c3.setColor("black");
		System.out.println(c3);
		System.out.println("the radius is: " + c3.getRadius());
		System.out.println("the color is: " + c3.getColor());
		System.out.println("the area is: " + c3.getArea());
		System.out.println("the circumference is:" + c3.getCircumference());

		// test getArea() and getCircumference()
		System.out.printf("the area is : %.2f%n", c1.getArea());
		System.out.printf("the circumference is: %.2f%n", c1.getCircumference());

	}

}
