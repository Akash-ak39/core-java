package ch6_ch10;

public class ClassDemo2 {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.met();
		obj.met2();
		int result=obj.met3();
		System.out.println(result);
	}
}
class Test{
	int i;// INSTANCE VARIABLE-outside the method
	void met() {
		int meti=10;//LOCAL VARIABLE
		System.out.println(i);
		System.out.println(meti);
	}
	void met2() {
		System.out.println(i);
	}
	int met3() {
		return 10;
	}
}