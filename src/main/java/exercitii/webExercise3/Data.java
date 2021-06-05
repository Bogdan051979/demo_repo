package exercitii.webExercise3;

public class Data {

	private String name;
	private String address;
	private String cell;

	public Data() {

		this.name = "maria";
		this.address = "32432423432";
		this.cell = "gdsfgwewrwrewtwe";

	}

	public String printData() {

		return name + "\t\n\t" + address + "\t\n\t\t" + cell;
	}
}
