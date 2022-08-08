package programming1;

public class Largest3Number_if_else {

	public static void main(String[] args) {
		double n1=15.5,n2=50.5,n3=15.0;
		if(n1>=n2 && n1>=n3)
			System.out.println(n1+ " is the largest number");
		else if (n2>=n1 && n2>=n3)
			System.out.println(n2+ " is the largest nummber");
		else
			System.out.println(n3+ " is the largest number");

	}

}
