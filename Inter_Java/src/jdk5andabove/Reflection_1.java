package jdk5andabove;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection_1 {
	public static void main(String[] args)throws Exception {
		Me a = new Me();
		Myhouse mh = new Myhouse();
		mh.caught(a);
	}
}
class Myhouse{
	public void caught(Object obj)throws Exception{
		Class c = obj.getClass();
		Field f = c.getField("name");
		System.out.println(f.get(obj));
		
		Method m = c.getMethod("work");
		m.invoke(obj);
		Father(obj);
	}
	public void Father(Object obj)throws Exception {
		Class c = obj.getClass();
		Field f = c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
		Method m = c.getDeclaredMethod("secretWork");
		m.setAccessible(true);
		m.invoke(obj);
	}
}
class Neighbhour{
	public String name="I am a Good Person";
	private String secretName="I do Loot from other's House..";
}
class Me{
	public String name="I am a Good boy and Rationalist..";
	private String secretName="I am a Rash Rider and Break the rules.. ";
	
	public void work() {
		System.out.println("I am a Software Engineer");
	}
	private void secretWork() {
		System.out.println("I am a Bike Racer and I race in public places...");
	}
}