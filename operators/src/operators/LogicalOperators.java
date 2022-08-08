package operators;

public class LogicalOperators {
	//&&-both the condition are satisfied
	//||-either 1 condition satisfied
	//!-

	public static void main(String[] args) {
		int n1=200,n2=300;
		System.out.println(n1>n2 || n1<n2);
		System.out.println(n1<n2 && n1==400);
		System.out.println(n1<n2 && n1!=100);
		System.out.println(n1<n2 && n1<=100);
		System.out.println(n1);
		System.out.println(n1>n2||n2<n1);
		System.out.println(n1<n2||n2<n1);
		
		

	}

}
