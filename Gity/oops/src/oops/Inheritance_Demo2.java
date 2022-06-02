package oops;

public class Inheritance_Demo2 {

	public static void main(String[] args) {
		Bikes bk = new Yamaha();
		bk.bi();
		bk.bike();
		Kawasaki k = new Kawasaki();
		k.bike();
		KTM duke = new KTM();
		duke.bike();

	}

}
abstract class Bikes{
	public Bikes() {
		System.out.println("Bikes Paradise ");
	}
	String name = "Gloabal Machines";
	final public void bi() {
		System.out.println("Humans made machines; Machines Help Humans");
	}
	abstract void bike();
			
}
class Yamaha extends Bikes{
	public void bike() {
		System.out.println("Yamaha machines are ruling the indian roads");
	}
}
class Kawasaki extends Bikes{
	public void bike() {
		System.out.println("Kawasaki is a superbike ");
	}
}
class KTM extends Bikes{
	public void bike() {
		System.out.println("Ktm is very powerful");
	}
}