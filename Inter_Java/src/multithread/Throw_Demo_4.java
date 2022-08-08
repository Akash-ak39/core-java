package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Throw_Demo_4 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->{
			synchronized (Theatre.class) {  //(Synchronized) is for lock the thread for particular time
				Thread.currentThread().setName("Yuvan");
				Theatre.toilet.usetoilet();
			}
		});
		es.execute(()->{
			synchronized (Theatre.class) {
				Thread.currentThread().setName("Ani");
				Theatre.toilet.usetoilet();
			}
		});
		es.shutdown();
	}

}
class Toilet{
	public void usetoilet() {
		Thread t= Thread.currentThread();
		String name= t.getName();
		System.out.println(name+" is using the toilet..");
		try {Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println(name+" came out of the toilet..");
	}
}
class Theatre{
	static Toilet toilet = new Toilet();
}