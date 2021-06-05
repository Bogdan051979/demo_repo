package exercitii.interfaces.circle;

public class TestRectangle {

	public static void main(String[] args) {

		/** construct a Rectangle instance with the given width and length */
		Rectangle r1 = new Rectangle(2.2, 5.5);
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println("the width is:" + r1.getWidth());
		System.out.println("The length is:" + r1.getLength());

	}
}
