package samples;

public class InnerClass2 {

	public static void main(String[] args) {
		Pepsi pep = new Pepsi();
		
		Kalimark kali = new Kalimark();
		
		pep.sellcola();
		kali.sellcola();

	}

}

class Pepsi{
	public void sellcola() {
		Kalimark.Campacola cc =new Kalimark().new Campacola();
		cc.makecola();
		System.out.println("Pepsi fills the cola in pepsi Bottle and sells");
		
	}
}

class Kalimark{
	public void sellcola() {
		Campacola cc = new Campacola();
		cc.makecola();
		System.out.println("Kalimark fills cola in Bovonto Bottle and Sells");
		
	}
	class Campacola{
		public void makecola() {
			System.out.println("CampaCola make Cola");
		}
	}
}
