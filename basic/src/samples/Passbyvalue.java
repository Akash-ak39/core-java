package samples;

public class Passbyvalue {

	public static void main(String[] args) {
		Passbyvalue obj = new Passbyvalue();
		obj.met(46);
		obj.met2("Bikers are great riders", 100);
		
		

	}
	
	public void met(int i) {
		i = i+10;
		System.out.println(i);
		met2("akash", 10);
		met3();// non static methods can access statics method
	}
	
	public void met2(String s,int i) {
		System.out.println(s+" : "+i);
		
	}
	
	public static void met3() {
		//met();
		// static methods cannot access non static methods and properties
		int b = 29;
		System.out.println(b);
	}

}
