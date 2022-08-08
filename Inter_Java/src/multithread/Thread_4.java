package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_4 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			synchronized (Bike.class) {
				Thread.currentThread().setName("Akash");
				Bike.rider.riding();
			}
		});
		es.execute(() -> {
			synchronized (Bike.class) {
				Thread.currentThread().setName("Valentino");
				Bike.rider.riding();
			}
		});
		es.shutdown();
	}

}

class Rider {
	public void riding() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " is riding the Bike...");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		System.out.println(name + " finished riding..");
	}
}

class Bike {
	static Rider rider = new Rider();
}