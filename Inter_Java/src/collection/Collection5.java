package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection5 {
	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.put("a1","JAWA");
		pro.put("a2","Yamaha");
		pro.put("a3","KTM");
		System.out.println(pro);
		
		System.out.println(pro.get("a2"));
		
		Set s = pro.entrySet();
		Iterator iter = s.iterator();
		while(iter.hasNext()) {
			Map.Entry me = (Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
