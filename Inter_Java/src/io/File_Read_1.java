package io;

import java.io.FileInputStream;

public class File_Read_1 {
	public static void main(String[] args) {
		
		//file with resources...
		try (FileInputStream fis = new FileInputStream("applog.txt");){
		//FileInputStream fis = new FileInputStream("applog.txt");
		System.out.println(fis.available());
		// this will read a value separate separately.
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println(fis.read());
//		int available = fis.available();
//		byte b[] = new byte[available];
//		fis.read(b);
//		System.out.println(fis.available());
//		String s=new String(b,0,available);
//		System.out.println(s);
		
		byte b[]=new byte[4];
		int noofbytesread=0;
		while((noofbytesread =fis.read(b))!=-1) {
			System.out.println(noofbytesread);
			String s = new String(b,0,noofbytesread);
			System.out.println(s);
		}
	}catch (Exception e){
		e.printStackTrace();
	}
	}
}
