package interfac;

public class Fu_In_Part1 {

	public static void main(String[] args) {
		//An
		new Part1() {
			@Override
			public void get() {
				System.out.println("Anonymous is called");
			}
		}.get();
		
	   //MR
		Part1 one = Fu_In_Part1::meet1;
		one.get();
		
		//Lambda
		Part1 l1 = ()->{
			System.out.println("Lambda is called");
		};
		l1.get();
		//General
		Part1 gen = new ak1();
		gen.get();
	}
	public static void meet1() {
		System.out.println("Method Reference is called");
	}

}
class ak1 implements Part1{// this class is for using general method
	@Override
	public void get() {
		System.out.println("General method is called..");
		
	}
}
interface Part1{
	public void get();
}