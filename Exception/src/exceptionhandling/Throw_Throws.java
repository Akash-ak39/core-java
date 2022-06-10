package exceptionhandling;

public class Throw_Throws {
	public static void main(String[] args) throws Exception{
		YesBank yb=new YesBank();
		//try {
			yb.withDraw(1000000);
		//}catch(Exception e) {
		//	System.out.println(e);
		//}
		System.out.println("business continues...");
	}
}
class YesBank{
	public void withDraw(int amt)throws MaxLimitException {
		if(amt>100000) {
			throw new MaxLimitException();
		}
	}
}
class MaxLimitException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception occurs";
	}
	
}


