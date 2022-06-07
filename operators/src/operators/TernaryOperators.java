package operators;

public class TernaryOperators {
	// (operand1(boolean) ? operand2(output if true) : operand3(output if false));

	public static void main(String[] args) {
		System.out.println((10>5) ? "yes it is greater" : "no it is not");
		System.out.println((10>500) ? "yes it is greater" : "no it is not");
		
		String ak=(20%3==0)?"even number":"it is odd number";
		System.out.println(ak);
		
		if(10%5==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		
		String name="valentine";
		if(name.equals("alfredo")){
			System.out.println("my name is ak");
		}
		else if(name.equals("valentino")) {
			System.out.println("i am vr 46");
		}
		else if (name.equals("ak")) {
			System.out.println("my name is akash and i am a biker");
		}
		else {
			System.out.println("i am not in this dimension");
		}
		}
	
		

	}


