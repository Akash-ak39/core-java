package ch6_ch10;

public class ClassDemo4 {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.met(10, 20, "AK");

		System.out.println("-------");

		int[] a = new int[] { 10, 20, 30, 40 };
		obj.met2(a);// in-direct way

		System.out.println("-------");

		obj.met2(new int[] { 10, 20, 30, 20 });// direct way

		System.out.println("--------");

		obj.met3(100, 20, 30, 40);

		System.out.println("--------");

		int b[] = obj.met3(120, 30, 50, 40, 8595);

		System.out.println("---------");

		for (int i : b) {
			System.out.println("...." + i);
		}
		System.out.println("------");
		
		obj.met4("aaa",23868,"hsaka",new Demo());
	}
}

class Demo {
	void met(int i, int j, String s) {
		System.out.println(i + ":" + j + ":" + s);
	}

	void met2(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i : a) {
			System.out.println(a);
		}
	}

	int[] met3(int... abc) { // variable argument (VARARGS)-passing variable in arguments
		for (int i : abc) {
			System.out.println(i);
		}
		return abc;
	}

	void met4(Object... o) {

	}
}