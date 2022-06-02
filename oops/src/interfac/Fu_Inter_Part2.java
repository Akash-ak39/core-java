package interfac;

public class Fu_Inter_Part2 {

	public static void main(String[] args) {
		int val = new Part2() {
			@Override
			public int get() {
			
				return 230;
			}
		}.get();
		System.out.println("Anonymous for Part 2 :"+val);
		
		Part2 to = new Fu_Inter_Part2()::meet2;
		val = to.get();
		System.out.println("Method Reference for Part 2 :"+val);
		
		Part2 lamb = ()->{
			return 2000;
		};
		val= lamb.get();
		System.out.println("Lambda for Part 2 :"+val);
		
		Part2 b2 =new Bot2();
		val = b2.get();
		System.out.println("General for Part 2 :"+val);
		
	}
	public int meet2() {
		return 500;
	}

}
class Bot2 implements Part2{
	@Override
	public int get() {
		// TODO Auto-generated method stub
		return 30000;
	}
}
interface Part2{
	public int get();
}
