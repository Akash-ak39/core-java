package samples;

public class MethodOverloadSamp {

	public static void main(String[] args) {
		MethodOverloadSamp obj = new MethodOverloadSamp();
		obj.met(20.5f);

		obj.met();
	}

	public void met(int i, int j) {
		System.out.println("int parameter met called");
	}

	int met() {
		System.out.println("no param met method called");
		return 1;
	}

	void met(float f) {
		System.out.println("Float param method called");
	}
}
