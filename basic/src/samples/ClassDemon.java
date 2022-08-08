package samples;

public class ClassDemon {
	public static void main(String[] args) {
		pen a=new pen();
		a.abc();
		//int c=a.abc();
		//System.out.println(c);
		//System.out.println(a.abc());
	}
}
class pen{
	int abc() {
		System.out.println("hi");
		return 0;
	}
	pen ab() {
		return new pen();
	}
}
class lead{
	
}