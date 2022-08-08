package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollDemo_4 {
	public static void main(String[] args) {
		// HashMap<String,String> hm=new HashMap<String, String>();
		TreeMap<String, String> hm = new TreeMap<String, String>();

		hm.put("s100", "ramu");
		hm.put("s200", "somu");
		hm.put("s300", "raju");
		hm.put("s400", "rakesh");
		hm.put("s500", "anwar");

		System.out.println(hm);

		System.out.println(hm.get("s200"));

		Set<Map.Entry<String, String>> s = hm.entrySet();

		Iterator<Map.Entry<String, String>> iter = s.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, String> me = iter.next();
			System.out.println(me.getKey() + ":" + me.getValue());
		}
	}
}
