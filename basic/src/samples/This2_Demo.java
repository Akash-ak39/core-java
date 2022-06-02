package samples;

public class This2_Demo {

	public static void main(String[] args) {
		room bhk = new room();
		bhk.pillow();
		ready th = new ready();
		th.neet(bhk);
		th.abc();
	}

}

class room{
	public  room () {
		System.out.println("Bed looks dirt..");
	}
	public void pillow() {
		System.out.println("pillow also remains same..");
	}
	public void setup() {
		ready now = new ready();
		now.neet(this);
	}
}

class ready{
	
	public void neet(room a) {
		
		System.out.println("now the bed is clean");
	}
	void abc() {
		room b = new room();
		b.setup();
	}
}
