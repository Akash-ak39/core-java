package programming1;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		System.out.println("Enter side of square:");
		// capture the user's input
		Scanner scan = new Scanner(System.in);
		double side=scan.nextDouble();
		double area= side*side;
		System.out.println("Area of square is :"+area);

	}

}
