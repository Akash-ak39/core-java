package programming1;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value for x..:");
		int x=scan.nextInt();
		System.out.println("enter value for y...:");
		int y=scan.nextInt();
		int mul=x*y;
		System.out.println("the multiplication of x and y..:" +mul);

	}

}
