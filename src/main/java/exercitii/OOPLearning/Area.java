package exercitii.OOPLearning;

public class Area {
	int length;
	int breadth;

	public Area(int l, int b) {
		this.breadth = b;
		this.length = l;
	}

	public void getArea() {
		int area = length * breadth;
		System.out.println("Area is " + area);
	}

	public static void main(String[] args) {
		Area a1 = new Area(5, 3);
		a1.getArea();

	}

}
