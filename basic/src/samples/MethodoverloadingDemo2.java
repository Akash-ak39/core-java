package samples;

public class MethodoverloadingDemo2 {

	public static void main(String[] args) {
		Animal ani = new Animal();

		// ani.lion(new Deer());

		// ani.lion(new Elephant());

		ani.lion(new tiger());

	}

}

class Animal {
	public void lion(Deer d) {
		System.out.println("Deer gets killed ");
	}

	public void lion(Elephant e) {
		System.out.println("lion gets killed");
	}

	public void lion(tiger t) {
		System.out.println("depends on who wins the fight");
	}
}

class Deer {
}

class Elephant {
}

class tiger {
}