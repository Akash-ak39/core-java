package programming1;

public class CastingDemo {

	public static void main(String[] args) {
		byte b = 97;
		int n = b;// auto type promotion because int is larger than byte
		//b=n;  its illegal because int is 32 bit and byte is 8 bit
		
		// to solve this we can do explicit casting
		 b=(byte)n; // 32bit is down casted to 8bit
		System.out.println(b);
		
		n=520;
		b=(byte)n;
		System.out.println(b);
		
		byte n1=2;
		byte n2=10;
		System.out.println(n1*n2);
		
		byte result=(byte)(n1*n2);// the result of an arithmetic operation will always be int
		 float f=100.33f;
		 n=(int)f; //float cannot be stored in int
		 System.out.println(n);
		 f=n;//integer can be stored in float but not vice versa
		 
		 
		 char c=101;
		 n=c;
		 //c=n;//we cannot store integer into character
		 System.out.println(c);
		 System.out.println((char)n);
		
		

	}

}
