package jdk5andabove;

public class Generics1 {
	public static void main(String[] args) {

		YamahaBike<Ride> yb = new YamahaBike<>();
		Ride ri = new Ride();
		//Fly fy = new Fly();

		yb.setobj(ri);

		ri = (Ride) yb.getobj();
		ri.Riding();
	}
}

class Ride {
	public void Riding() {
		System.out.println("Riding a Bike...");
	}
}

class Fly {
	public void Flying() {
		System.out.println("Flying in a bike on roads....");
	}
}

abstract class automobile {

}

class Yamaha extends automobile {

}

class YamahaBike<B> {
	private B obj;

	public B getobj() {
		return this.obj;
	}

	public void setobj(B obj) {
		this.obj = obj;
	}
}