package samples;

public class PBV__S {

	public static void main(String[] args) {
		PBV__S mark = new PBV__S();
		mark.english("English is just a Language",66);
		mark.tamil("Tamil is unique Language", 99);
		mark.social("Social is GK");
		
	}
	public void english(String s,int a) {
		a = a+25;
		System.out.println(s+" : "+a);
	}
	public void tamil(String s, int a) {
		System.out.println(s+" : "+a);
	}
	public static void social(String s) {
		int b =50;
		System.out.println(s+" : " +b);
	}

}
