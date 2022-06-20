package collection;

import java.util.Map;
import java.util.WeakHashMap;

public class CollDemo6 {
	public static void main(String[] args) {
		Map<String,String> map=new WeakHashMap<String, String>();
		
		String key1=new String("a1000");
		String key2=new String("a2000");
		
		map.put(key1, "behind force");
		map.put(key2, "anound tech");
		
		System.out.println(map);
		key1=null;
		System.out.println(map);
		System.gc();
		
		System.out.println(map);
	}

}
