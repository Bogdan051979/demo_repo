package exercitii.homework1;

public class Swimmer extends Walker {

	/** declaring and instantiate a variable talker of type Talker */
	private Talker talker = new Talker();

	// public Swimmer(Talker talker) {
	// this.talker = talker;
	//
	// }
	/** a getter that return Talker */
	public Talker getTalker() {
		return this.talker;
	}

	public String performSwimm() {
		return "I can swimm";
	}

}
