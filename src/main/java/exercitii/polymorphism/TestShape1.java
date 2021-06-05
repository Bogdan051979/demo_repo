package exercitii.polymorphism;

public class TestShape1 {
	public static void main(String[] args) {

		Shape1 s1 = new Rectangle1("red", 1, 2);
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());

		Shape1 s2 = new Triangle("blue", 2, 3);
		System.out.println(s2);
		System.out.println("area is " + s2.getArea());

		Shape1 s3 = new Shape1("green");
		System.out.println(s3);
		System.out.println("area is " + s3.getArea());

	}

}
