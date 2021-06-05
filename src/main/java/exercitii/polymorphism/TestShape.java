package exercitii.polymorphism;

public class TestShape {

	public static void main(String[] args) {
		/** Upcast */
		Shape s1 = new Circle(5.5, "red", false);
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println();

		/** downcast Shape s1 to Circle */
		Circle c1 = (Circle) s1;
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		System.out.println();

		/**
		 * Shape s2 = new Shape();Shape class is a abstract class and cannot be instantiated
		 */
		/** upcast Rectangle to Shape s3 */
		Shape s3 = new Rectangle(1.0, 2.0, "red", false);
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println();

		/** Downcast Shape s3 to Rectangle */
		Rectangle r1 = (Rectangle) s3;
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		System.out.println();

		/** upcast Square to Shape s4 */
		Shape s4 = new Square(6.6);
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println();

		/** downcast Shape s4 to Rectangle */
		Rectangle r2 = (Rectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getLength());
		System.out.println();

		/** downcast Rectangle r2 to Square */
		Square sq1 = (Square) r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
	}

}
