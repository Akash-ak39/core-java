package keyword;

public class Super_Cons_Demo {

	public static void main(String[] args) {
		Consbot bot = new Consbot("akash");
	}

}

abstract class Constop {
	public Constop() {
		System.out.println("Top Cons Object created");
	}
}

abstract class Consmed extends Constop {
	public Consmed(int i) {
		System.out.println("med Cons object Created " + i);
	}
}

class Consbot extends Consmed {
	public Consbot(String s) {
		super(50);// super call to constructor should be the first line
		System.out.println("bottom Cons Object Created "+s);
	}
}
