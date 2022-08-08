package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("Akash");
		list.add("Valentiono");
		list.add("Rossi");
		
		System.out.println("Original size..:"+list.size());
		list.add("Marques");
		System.out.println("Modified size.."+list.size());
		list.remove(0);
		System.out.println(list.get(1));
		System.out.println(list);
		System.out.println("_____");
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("_________");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("______");
		Iterator<String> iter = list.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("_______");
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("____________");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
