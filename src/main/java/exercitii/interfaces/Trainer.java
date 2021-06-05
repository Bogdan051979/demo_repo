package exercitii.interfaces;

public class Trainer {
	public void teach(Animal anim) {
		anim.move();
		anim.action();
	}

	public static void main(String[] args) {
		Trainer trainer = new Trainer();

		Dog dog = new Dog();

		Bird bird = new Bird();

		Fish fish = new Fish();

		trainer.teach(dog);
		trainer.teach(bird);
		trainer.teach(fish);

	}
}
