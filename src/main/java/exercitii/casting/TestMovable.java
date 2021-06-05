package exercitii.casting;

public class TestMovable {

	public static void main(String[] args) {

		MovablePoint p1 = new MovablePoint(1, 2);
		System.out.println(p1);
		p1.moveDown();
		System.out.println(p1);
		p1.moveUp();
		System.out.println(p1);
		p1.moveLeft();
		System.out.println(p1);
		p1.moveRight();
		System.out.println(p1);
		p1.moveRight();
		System.out.println(p1);
		System.out.println();
		Movable p2 = new MovablePoint(3, 4);
		System.out.println(p2);
		p2.moveUp();
		System.out.println(p2);
		MovablePoint p3 = (MovablePoint) p2;
		System.out.println(p3);

		Movable p4 = new MovablePoint(5, 6);
		System.out.println(p4);
		MovablePoint p5 = (MovablePoint) p4;
		System.out.println(p5);

	}

}
