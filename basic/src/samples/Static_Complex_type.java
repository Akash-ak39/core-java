package samples;

public class Static_Complex_type {

	public static void main(String[] args) {
		Human power = new Human();
		Human normal = new Human(); 
		
		System.out.println(power.L +" : " + normal.H);
		System.out.println(normal.L +" : "+ power.H);
		System.out.println();
		System.out.println(normal.H +" : "+normal.L);
		System.out.println(power.H+" : "+power.L);

	}

}

class Human{
	Leg L = new Leg();
	static Hand H = new Hand();
	
}
class Leg{
	
}
class Hand{
	
}