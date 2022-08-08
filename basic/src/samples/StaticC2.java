package samples;

public class StaticC2 {

	public static void main(String[] args) {
		staff s = new staff();
		staff v = new staff();
		System.out.println(s.o +" "+ s.r);
		System.out.println(v.o+" "+ v.r);

	}

}
class office{
	
	
}
class staff{
	static office o = new office();
	role r = new role();
}
class role{
	
}
