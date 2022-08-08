package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Collection3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(new String("Mohan"));
		list.add(new String("Illa"));
		list.add(new String("Aadi"));
		list.add(new String("Arya"));
		list.add(new String("Muthu"));
		list.add(new String("Aadi"));
		System.out.println("Before Sorting..: "+list);
	//	Collections.sort(list,new MyCompartor());
		System.out.println("After Sorting..: "+list);
		
		HashSet<String> hs = new HashSet<String>(list);

		System.out.println("Hash Set..: "+hs);
		
//		TreeSet<Colleague> ts = new TreeSet<Colleague>(new MyCompartor());
//		ts.addAll(hs);
//		System.out.println("Tree set..: "+ts);
	}
}
//class Colleague implements Comparable<Colleague> {
//	String name;
//	public Colleague(String name) {
//		this.name=name;
//	}
//	@Override
//	public String toString() {
//		return this.name;
//	}
//	@Override
//	public int compareTo(Colleague o) {
//		return this.name.compareTo(o.name);
//	}
//}
//class MyCompartor implements Comparator<Colleague>{
//	@Override
//	public int compare(Colleague o1, Colleague o2) {
//		return o2.compareTo(o1);
//	}
//}