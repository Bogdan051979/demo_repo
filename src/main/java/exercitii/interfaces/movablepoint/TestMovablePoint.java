package exercitii.interfaces.movablepoint;

public class TestMovablePoint {

	public static void main(String[] args) {

		/** construct a MovablePoint instance */
		MovablePoint mvp1 = new MovablePoint(1, 2, 3, 4);
		System.out.println(mvp1);
		mvp1.moveUp();
		System.out.println(mvp1);
		mvp1.moveDown();
		System.out.println(mvp1);
		mvp1.moveLeft();
		System.out.println(mvp1);
		mvp1.moveLeft();
		System.out.println(mvp1);
	}

}
