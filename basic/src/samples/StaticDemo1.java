package samples;

public class StaticDemo1 {
	public static void main(String[] args) {
		Road.vehicle="any one can ride...";
		System.out.println(Road.vehicle);
		
		Road car = new Road(); // object creation for using instance variable
		car.heavy="Monster Truck";
		Road.vehicle="mercedez Benz ";
		
		System.out.println("heavy weight : "+car.heavy);
		System.out.println("classical vehical : "+Road.vehicle);
		car.heavy("Monster Truck");
		
		Road Bike = new Road();
		Bike.heavy="Ninja 1000cc";
		System.out.println("king of roads :"+Bike.heavy);
		System.out.println(Bike.heavy +" is hotter than " +car.heavy);
		
		Road.vehicle="Human love Machines";
		
		System.out.println(Road.vehicle);
	}

}


class Road{
	static String vehicle;  // class variable
	String heavy;  // Instance Variable [to access IV we need to create an object]
	public void heavy(String big) {
		String bigs = big; // local variable [we cannot able to access local variable out side the main method]
		System.out.println(bigs);
	}
}