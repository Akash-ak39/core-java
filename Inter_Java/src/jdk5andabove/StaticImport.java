package jdk5andabove;

import multithread.Interjava;
import static multithread.Interjava.pi;// this is another way to import static
public class StaticImport {
	public static void main(String[] args) {
		//System.out.println(Interjava.pi);// this is one way of using static import[pi]
		System.out.println(pi);//using by another way
	}

}
