package collection;

import java.util.HashMap;
//TreeMap will give Output Values in Order
// HashMap will give Output values shuffled not in order
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collection4 {
	public static void main(String[] args) {
		//HashMap<String,String> hm=new HashMap<String, String>();
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("No1", "A.P.J");
		tm.put("No2", "Periyar");
		tm.put("No3", "Prabhakaran");
		tm.put("No4", "Stalin");
		tm.put("No5", "Ajith");
		System.out.println(tm);

		System.out.println(tm.get("No4"));

		Set<Map.Entry<String, String>> s = tm.entrySet();

		Iterator<Map.Entry<String, String>> iter = s.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, String> me = iter.next();
			System.out.println(me.getKey() + ":" + me.getValue());
		}

	}
}
