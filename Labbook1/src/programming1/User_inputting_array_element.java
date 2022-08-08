package programming1;

import java.util.Scanner;

public class User_inputting_array_element {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[2];
		int sum=0;
		System.out.println("Enter the elements:");
		for(int i=0;i<2;i++) {
			array[i]=scan.nextInt();
		}
		for(int num:array) {
			sum=sum+num;
		}
		System.out.println("Sum of array elements is :"+sum);
	}

}
