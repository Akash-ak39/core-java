package programming1;

import java.util.Scanner;

public class AreofCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value :");
		double radius=scan.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("the area of circle is :"+area);
		double circumference=Math.PI*2*radius;
		System.out.println("the circumference of the circle is :"+circumference);

	}

}
