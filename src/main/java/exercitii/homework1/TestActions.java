package exercitii.homework1;

public class TestActions {

	public static void main(String[] args) {
		Walker walker = new Walker();
		System.out.println("The walker says: " + walker.performBreathe() + " and " + walker.performWalk() + ".");

		Talker talker = new Talker();
		System.out.println("The talker says: " + talker.performBreathe() + " and " + talker.performTalk() + ".");

		Swimmer swimmer = new Swimmer();
		System.out.println("The swimmer says: " + swimmer.performBreathe() + ", " + swimmer.performSwimm() + ", "
				+ swimmer.performWalk() + " and " + talker.performTalk() + ".");

	}

}
