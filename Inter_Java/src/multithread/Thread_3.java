package multithread;

public class Thread_3 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Before customizing "+t);// this is to know the name,Priority of thread,Group which belong to.//[main,5,main].
		t.setName("Akash");
		t.setPriority(10);
		System.out.println("After customizing "+t);
	}

}
