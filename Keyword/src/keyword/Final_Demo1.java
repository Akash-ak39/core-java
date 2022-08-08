package keyword;

public class Final_Demo1 {

	public static void main(String[] args) {
		Fincla fin = new Fincla();
		// fin.i=300;//because final variables are constant
		fin.met();
		fin.met(35);
		//fin.s = 400;

	}

}

final class Fincla {
	final int i = 20;// final variables are constant..
	final int s = 30;

	final void met() {
		System.out.println("Powerful..." + i);
	}

	final void met(int s) {
		System.out.println("More Powerful..." + s);
	}
}
//class FinClas extends Fincla{

//}
