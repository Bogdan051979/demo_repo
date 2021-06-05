package exercitii.interfaces.movable;

public class TestMovableCircle {

	public static void main(String[] args) {

		MovablePoint center = new MovablePoint(1, 2, 3, 4);
		System.out.println(center);

		MovableCircle c1 = new MovableCircle(center, 9);
		System.out.println(c1);
		center.moveRight();
		System.out.println(center);
		c1.moveRight();
		System.out.println(c1);
		c1.moveLeft();
		System.out.println(c1);
		center.moveRight();
		System.out.println(center);
		center.moveRight();
		System.out.println(center);

	}

}
