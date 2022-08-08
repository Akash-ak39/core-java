package demo;

import java.util.Scanner;

public class Keyboard_Input {

	public static void main(String[] args) {
		Scanner keyin=new Scanner(System.in);
		
		System.out.println("Please enter your name....:");
		
		String name=keyin.next();
		System.out.println("Welcome Mr../Mrs...:"+name);
		
		System.out.println("Please enter your age...:");
		int age=keyin.nextInt();
		
		System.out.println("your age is...:"+age);  

	}

}
