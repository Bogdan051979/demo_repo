package exercitii.OOPLearning;

public class Main9 {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		Main9 m = new Main9();
		m.setName("Maria");
		System.out.println("Her name is " + m.getName());

	}

}
