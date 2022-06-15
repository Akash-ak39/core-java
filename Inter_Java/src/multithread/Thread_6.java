package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_6 {
	public static void main(String[] args) {
		Auditorium ad = new Auditorium();
		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(()->{
			Thread.currentThread().setName("Yuvan");
			ad.PlayMusic();
			ad.Dance();
			ad.Vibe();
			ad.exit();
		});
		es.execute(()->{
			Thread.currentThread().setName("Jackson");
			ad.PlayMusic();
			ad.Dance();
			ad.Vibe();
			ad.exit();
		});
		es.execute(()->{
			Thread.currentThread().setName("Wiz");
			ad.PlayMusic();
			ad.Dance();
			ad.Vibe();
			ad.exit();
		});
		es.shutdown();
	}

}

class Auditorium {
	synchronized public void PlayMusic() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " is Playing Music..");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println(name + " finished Playing Music..");

	}
	synchronized public void Dance() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is Dancing..");
		try {Thread.sleep(1000);
		}catch(Exception e) {}
		System.out.println(name+" Finished Dancing..");
	}
	synchronized public void Vibe() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name+" is Vibing..");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+" Vibed and moved..");
	}
	synchronized public void exit() {
		Thread t =Thread.currentThread();
		String name = t.getName();
		System.out.println(name+" exit");
	}
}
