package programming1;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer number:");
		num=input.nextInt();
		
		if(num%2==0) {
			System.out.println("Entered number is even.");
		}
		else
		System.out.println("Entered number is odd.");

	}

}
