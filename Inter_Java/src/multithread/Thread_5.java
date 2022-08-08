package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_5 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Home b1 = new Home();
		Home b2 = new Home();
		
		es.execute(()->{
			//synchronized (Home.class) {
			synchronized (b1) {
				Thread.currentThread().setName("Che Guevara");
				b1.bed.sleep();
			}
		});
		es.execute(()->{
			//synchronized (Home.class) {
			synchronized (b2) {
				Thread.currentThread().setName("Fidel Castro");
				b2.bed.sleep();
			}
		});
	}
}
class BedRoom{
	public void sleep() {
	Thread t = Thread.currentThread();
	String name=t.getName();
	System.out.println(name+" is Sleeping ,zzz...");
	try {Thread.sleep(2000);}catch(Exception e) {}
	System.out.println(name+" waked up");
	}
}
class Home{
	static BedRoom bed = new BedRoom();
}