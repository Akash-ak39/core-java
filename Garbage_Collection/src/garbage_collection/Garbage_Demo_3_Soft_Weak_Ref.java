package garbage_collection;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Garbage_Demo_3_Soft_Weak_Ref {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Available Memory..: "+r.maxMemory());
		System.out.println("Available Processors..: "+r.availableProcessors());
		System.out.println("Free Memory..: "+r.freeMemory());
		r.gc();
		System.out.println("Free Memory after gc..; "+r.freeMemory());
		
		Food food = new Food();
		System.out.println("Free Memory..: "+r.freeMemory());
		//SoftReference Soft = new SoftReference(food);
		WeakReference Weak = new WeakReference(food);
		food = null;
		
		r.gc();
		System.out.println("Free Memory..: "+r.freeMemory());
		food=(Food)Weak.get();
		System.out.println(food);
	}

}
class Food{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize for the food Object called");
	}
}
