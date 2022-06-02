package programming1;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" *");
				
			}
			
			System.out.println();
			
		} 
		
		
		System.out.println("............");
		
		// reverse pyramid
		System.out.println(" ");
		
		int t=5;
		for (int x=1;x<=t;x++) {
			for(int y=t;y>=x;y--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		 
		// Floyd triangle
		

		int rows,number=1, counter,j;
		Scanner input= new Scanner(System.in);// To get user input in console
		System.out.println("Enter the number of rows for Floyd's Triangle:");
		rows=input.nextInt();
		System.out.println("Floys's Triangle");
		System.out.println("**********");
		for(counter = 1; counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}  
	}

}

