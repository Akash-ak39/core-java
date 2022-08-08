package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* what is thread?
 * A Process within a Process is called Thread
 * 
 */
// Below comment sections in a program is for general method....... 

public class Thread_Demo1 {

	public static void main(String[] args) {
		System.out.println("Soup is ready and served Properly");
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(()->{met();});
//		es.execute(new MyRunnable());
		es.shutdown();
//		Thread t=new Thread(new MyRunnable());
//		t.start();
		System.out.println("Starters are ready and served before Main Dish");
	}
	public static void met() {
		try {Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println("Main Dish Served...");
	}

}
// General way to achieve thread(College/google)
/*class MyRunnable implements Runnable{
	@Override
	public void run() {
		Thread_Demo1.met();
	}
}
*/