package exercitii.polymorphism;

public class TestMonster {

	public static void main(String[] args) {

		/** declare instances of superclass, substituted by subclasses */

		Monster m1 = new FireMonster("Foc");
		System.out.println(m1 instanceof FireMonster);
		Monster m2 = new WaterMonster("Apa");
		Monster m3 = new StoneMonster("Piatra");
		Monster m5 = new Monster("Fier");
		System.out.println(m5.attack());

		System.out.println("First monster must " + m1.attack());
		System.out.println("Second monster must " + m2.attack());
		System.out.println("Third monster must " + m3.attack());

		FireMonster m4 = (FireMonster) m1;
		System.out.println(m4.attack());
		System.out.println(m2 instanceof StoneMonster);

	}
}
