package samples;

public class ClassDemo {

	public static void main(String[] args) {
		Biryani obj = new Biryani();
		obj.spice();
		obj.tasty();
	}
}

class Biryani implements chef {
	int i;

	void spice() {
		int spice = 20;
		System.out.println(spice);
	}

	public void tasty() {
		int a = 10;
		System.out.println(a);
	}
}

abstract class food {

}

interface chef {
	void tasty();

}
