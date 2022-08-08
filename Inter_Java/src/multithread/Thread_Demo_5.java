package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Demo_5 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Thiatre iMax=new Thiatre();
		Thiatre iMax2=new Thiatre();
		
		es.execute(
				()->{
					synchronized(Thiatre.class) {	//Class lock
					//synchronized(iMax) {  		// Object lock
					Thread.currentThread().setName("rajini");
					Theatre.toilet.usetoilet();
					//iMax.toilet.useToilet();
					}
				}
		);
		
		es.execute(
				()->{
					synchronized(Thiatre.class) {	//Class lock
					//synchronized(iMax2) {			//Object lock
					Thread.currentThread().setName("kamal");
					Theatre.toilet.usetoilet();
					//iMax2.toilet.useToilet();
					}
				}
		);
		es.shutdown();
	}
}
class Tailet{
	public void usetoilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the toilet...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" came out of toilet...");
	}
}
class Thiatre{
	Tailet toilet=new Tailet();
}
