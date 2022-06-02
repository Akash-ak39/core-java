package samples;

public class Static_Constructor {
	static {
		System.out.println("static block called....");
	}
	public static void main(String[] args) {
		new SBDemo(); // anonymous object creation for using Constructor block
		SBDemo.met(); // method calling
		SBDemo.met2();
	}
}
class SBDemo{
    static {  // static block
		System.out.println("SBDemo static block called....");
	}
	SBDemo(){//constructor block
		System.out.println("constructor called...");
	}
	static void met() {
		System.out.println("static method met called...");
	}
	
	static void met2() {
		System.out.println("static method met2 called...");
	}
}


