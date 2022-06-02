package samples;

import org.apache.log4j.Logger;

public class Calci {
	static Logger logger = Logger.getLogger(Calci.class);

	public static void main(String[] args) {
		Calci cal = new Calci();
		cal.add1(20,30);
		cal.add2(10, 20);
		cal.add3(40, 5);
		cal.add4(46,50,10,29);
		cal.add5(new int[] {30,40,20});
			
		}
	void add1(int i,int j) {
		int sum=i+j;
		System.out.println("The sum of"+i+"and"+j+"is : "+sum);
	}
	
	int add2(int i,int j) {
		return i+j;
	}
	
	void add3(int i,int j) {
		display(i+j);
	}
	
	void display(int s) {
		System.out.println("the result is : "+s);
	}
	
	void add4(int...i) {
		int result = 0;
		for(int s:i) {
			result = result+s;
		}
		System.out.println("the result is...%d"+result);
	}
	
	void add5(int i[]) {
		int result=0;
		for(int s:i) {
			result = result+s;		
	}
		System.out.println("The result is ..%d"+result);
	}

	}


