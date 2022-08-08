package ch6_ch10;

public class ClassDemo5 {
public static void main(String[] args) {
	Demo2 obj=new Demo2();
	obj.met(0, 0, null, 0);
	
	obj.met2(23,"aaaa","hunf",new String("akash"),199,897,34);
	System.out.println("--------");
	
	obj.met3(new Object[] {67,"idi","kjij",new String("rossi"),865,98,467});
}
}
class Demo2{
	void met(int i,int j, String s,int l ) {
		
	}
	void met2(Object...obj) {
		System.out.println(obj.length);
		System.out.println(obj[2]);
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}
	void met3(Object...obj) {
		
	}
}