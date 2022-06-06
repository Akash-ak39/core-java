package exceptionhandling;

public class Exception_Sample1 {
	public static void main (String[] args) {
		System.out.println("Ready For Exception");
		try {
			int b = 100/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
			new Handling().hand(e);
		}
		System.out.println("After Exception..");
		
	}
}
class Handling{
	public void hand(ArithmeticException ae) {
		System.out.println("numbers should not divide by Zero's");
	}
	
}