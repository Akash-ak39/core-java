package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Demo_6 {
	public static void main(String[] args) {
		CounsellingHall ch = new CounsellingHall();
		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(() -> {
			Thread.currentThread().setName("Akash");
			ch.ShowPapers();
			ch.selectcollege();
			ch.payfees();
			ch.exit();
		});
		es.execute(() -> {
			Thread.currentThread().setName("Ajay");
			ch.ShowPapers();
			ch.selectcollege();
			ch.payfees();
			ch.exit();
		});
		es.execute(() -> {
			Thread.currentThread().setName("Surendar");
			ch.ShowPapers();
			ch.selectcollege();
			ch.payfees();
			ch.exit();
		});
		es.shutdown();
	}

}

class CounsellingHall {
	synchronized public void ShowPapers() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " Showing Papers..");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println(name + " Completed showing Papers..and moves");
	}

	synchronized public void selectcollege() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " Selecting College..");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println(name + " Selected the College..and moves");
	}

	synchronized public void payfees() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " Paying Fees..");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println(name + " Payed the Fees..and moves");
	}

	synchronized public void exit() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " Exit");
	}
}