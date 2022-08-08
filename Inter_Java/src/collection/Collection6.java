package collection;

import java.util.Map;
import java.util.WeakHashMap;

public class Collection6 {
public static void main(String[] args) {
	Map<String,String> map = new WeakHashMap<String, String>();
	String kee1 = new String("a10000");
	String kee2 = new String("a20000");
	
	map.put(kee1, "Behind Force");
	map.put(kee2, "Anoud Tec");
	
	System.out.println(map);
	kee1 = null;
	System.out.println(map);
	System.gc();
	System.out.println(map);
}
}
