package garbage_collection;

public class Garbage_Demo1_Own {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Available Memory..: "+r.maxMemory());
		System.out.println("Available Processors..: "+r.availableProcessors());
		System.out.println("Free Memory..: "+r.freeMemory());
		System.out.println("Total Memory..: "+r.totalMemory());
		
		r.gc();
		System.out.println("Free Memory..: "+r.freeMemory());
	}

}
class GrandMother{
	String age;
	private String gold ="under the tree....";
	public GrandMother() {
		for(int i=0;i<1000;i++) {
			age=new String("my name is...billa...:"+i);
		}
	}
	protected String getGold() {
		return "The Gold is...:"+gold;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(getGold());
	}
}
