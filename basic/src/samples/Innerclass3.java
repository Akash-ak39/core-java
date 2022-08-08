package samples;

public class Innerclass3 {

	public static void main(String[] args) {
		Ktm k =new Ktm();
		Kawasaki n = new Kawasaki();
		
		k.Duke();
		n.Ninja();
		
		

	}

}
class Ktm{
	public void Duke() {
		Kawasaki.Z1000 kz = new Kawasaki().new Z1000();
		kz.power();
		System.out.println("KTM is not a superbike");
		
	}
}
class Kawasaki{
	public void Ninja() {
		Z1000 z = new Z1000();
		z.power();
		System.out.println("Kawasaki makes ninja Bike model and sells");
	}
	class Z1000{
		public void power() {
			System.out.println("Z1000 is a super bike");
		}
	}
}