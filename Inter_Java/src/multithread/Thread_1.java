package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_1 {

	public static void main(String[] args) {
		System.out.println("Process 1 is Ready...");
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			met();
		});
		es.shutdown();
		System.out.println("Process 2 is ready..");

	}

	public static void met() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("Process 3 is ready for Production");
	}

}
