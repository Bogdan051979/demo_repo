package automation.oop;

public class LightBulb {

	public static void main(String[] args) {

		Light bulb1 = new Light();
		Light bulb2 = new Light();
		Light bulb3 = new Light();

		System.out.println("After turn on intensity is " + bulb1.getIntensity());
		System.out.println("After turn on state is " + bulb1.isOn());

		bulb1.brighten();

		System.out.println("After brigthen intensity is " + bulb1.getIntensity());
		System.out.println("After brighten state is " + bulb1.isOn());

		bulb1.dim();

		System.out.println("After dim intensity is " + bulb1.getIntensity());
		System.out.println("After dim state is " + bulb1.isOn());

		bulb1.turnOff();

		System.out.println("After turn off intensity is " + bulb1.getIntensity());
		System.out.println("After turn off state is " + bulb1.isOn());

		bulb1.turnOn();

		System.out.println("After turn on (again) intensity is " + bulb1.getIntensity());
		System.out.println("After turn on (again) state is " + bulb1.isOn());

		// daca lui bulb1 ii alocam null il distrugem si astfel el va inceta sa mai existe;
		// garbage collector il va elibera din mermorie
		// bulb1 = null;
		// nu se poate chema o funcrie a unui obiect care nu mai exista
		// bulb1.getState();
		// bulb1.getIntensity();
		// se poate instantia un nou obiect bulb1 insa care nu va mai avea nici o legatura cu primul creat si apoi distrus;
		// bulb1 = new Light();
	}

}
