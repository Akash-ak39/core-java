package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Inter_Thread_Demo_7 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Gun dp = new Gun();
		es.execute(()->{
			for(int i=0;i<2;i++) {
				dp.Load();
			}
		});
		es.execute(()->{
			for(int i=0;i<2;i++) {
				dp.Shoot();
			}
		});
		es.shutdown();
	}
}
class Gun{
	boolean flag;
	synchronized public void Load() {
		if(flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Loader loads the Gun...");
		flag=true;
		notify();
	}
	synchronized public void Shoot() {
		if(!flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Shooter shoots... the Gun...");
		flag=false;
		notify();
	}
}