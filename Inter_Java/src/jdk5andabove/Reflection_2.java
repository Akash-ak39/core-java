package jdk5andabove;

import java.lang.reflect.Method;

public class Reflection_2 {
	public static void main(String[] args)throws Exception {
		Deemo obj = new Deemo();//static Object craetion
		System.out.println(obj);
		
		Deemo dem = (Deemo)Class.forName("multithread.Deemo").newInstance();//Dynamic Object Creation
		System.out.println(dem);
		
		dem=(Deemo)Class.forName("multithread.Deemo").getConstructor().newInstance();
		System.out.println(dem);
		
		dem=(Deemo)Class.forName("multithread.Deemo").getConstructor(String.class,int.class).newInstance("hello",100);
		System.out.println(dem);
		
		Class c = dem.getClass();
		Method m=c.getDeclaredMethod("met",String.class,Emplayee.class);
		
		m.setAccessible(true);
		System.out.println(m);
		m.invoke(dem,"hello", new Emplayee());
	}

}
class Deemo{
	public Deemo() {
		System.out.println("empty constructor...");
	}
	public Deemo(String str,int i) {
		System.out.println(str+"...."+i);
	}
	public void met(String s,Emplayee e) {
		System.out.println(s+"...."+e);
	}
}
class Emplayee{
	public Emplayee() {
		System.out.println("employee object created...");
	}
}