package automation.oop1;

public class Circle extends Shape {

	@Override
	public String draw() {
		return "drawing a circle";
	}

	@Override
	public String toString() {
		return "Circle of color:" + this.getColor();
	}
}
