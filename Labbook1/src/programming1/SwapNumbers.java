package programming1;

public class SwapNumbers {

	public static void main(String[] args) {
		int f1=2, f2 = 4;
		System.out.println("..Before swap..");
		System.out.println("First number=" + f1);
		System.out.println("Second number=" +f2);
		
		int first=f1;
		
		f1=f2;
		
		f2=first;
		
		System.out.println("..after swap..");
		System.out.println("First number="+f1);
		System.out.println("second number="+f2);
		

	}

}
