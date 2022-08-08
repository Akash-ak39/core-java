package samples;

public class ClassDemo3 {

	public static void main(String[] args) {
		demo obj = new demo();
		obj.met(10, 20, "hello");
		obj.met2(new int [] {10,20,30,40});
		

	}

}
	class demo {
		void met(int i,int j,String s) {
			System.out.println(+i+":"+j+":"+s);
		}
		void met2(int a[]) {
			for (int i:a) {
			System.out.println(i);
		}
      }
	}
