package samples;

public class ClassDemo2 extends naatusaraku {
	int s;
	int c = a * b;

	public void rs() {

	}

	public static void main(String[] args) {
		ClassDemo2 d = new ClassDemo2();
		d.rs();
		System.out.println(d.c);
		// int c=a*b;
		// System.out.println(c);
		sprit alcohol = new sprit();
		alcohol.jd();
		alcohol.rc();

	}
}

class sprit {
	void rc() {
		int i = 10;
		System.out.println(i);
	}

	void jd() {
		int a = 5;
		System.out.println(a);
	}
}

abstract class naatusaraku {
	int a = 6, b = 10;

	void rs() {
		System.out.println("naatusaraku is bad for health");
	}
}

interface saraku {
	void mc();

}
