package oops;

public class InheritanceDemo1 {

	public static void main(String[] args) {
		NS200 Bajaj = new NS150();
		System.out.println(Bajaj.name);
		Bajaj.abs();
		Bajaj.aabs();

	}

}

abstract class NS200{
	public NS200() {
		System.out.println("200 NS is One Of the Powerful Machine");
	}
	final String name = "Pulsar";
	final public void aabs() {
		System.out.println("Abs makes this machine more Powerful");
	}
	abstract void abs();
}
class NS150 extends NS200{
	public void abs(){
		System.out.println("NON ABS is major disadavantage of 150");
	}
}
class Mt15 extends NS200{
	public void abs() {
		
	}
}