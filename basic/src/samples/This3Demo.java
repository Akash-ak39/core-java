package samples;

public class This3Demo {
	String s;
	public This3Demo(String s) {
		this.s=s;
	}
	public static void main(String[] args) {
		//this keyword cannot be used inside a static method
		This3Demo obj=new This3Demo("some value...");
		obj.printS("aaaaaaaaaa");
	}
	
	public void printS(String s) {
		System.out.println(this.s);
	}

}
