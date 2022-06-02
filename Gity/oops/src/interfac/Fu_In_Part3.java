package interfac;

public class Fu_In_Part3 {

	public static void main(String[] args) {
		//anonymous
		String val = new Part3() {
			@Override
			public String met(int i, String s) {
				
				return i+":"+s;
			}
		}.met(10,"Anonymous");
		System.out.println("Anonymous is called..:"+val);
		
		Part3 three = new Fu_In_Part3()::mymethod3;
		val=three.met(50, "Method Reference");
		System.out.println("Method Reference is called..:"+val);
		
		Part3 threel = (int num,String str)->{
			return num+":"+str;
		};
		val=threel.met(10010, "Lambda");
		System.out.println("value is..:"+val);

	}
	public String mymethod3(int i, String s) {
		return i+":"+s;
	}
}

interface Part3{
	public String met(int i , String s);
}
