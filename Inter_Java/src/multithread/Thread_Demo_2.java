package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Demo_2 {
	public Thread_Demo_2() {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			System.out.println("Child Thread Called...");
		});
		es.shutdown();
	}

	public static void main(String[] args) {
		new Thread_Demo_2();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception c) {

			}
		}

	}

}
