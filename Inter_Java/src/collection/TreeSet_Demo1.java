package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo1 {
	public static void main(String[] args) {
		Set ts = new TreeSet(new MyComparable());
		ts.add(new A("aaaa"));
		ts.add(new A("jjjj"));
		ts.add(new A("eeeee"));
		System.out.println("Tree Set-->" + ts);
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println("Iterator -->" + it.next());
		}
	}
}

class MyComparable implements Comparator<A> {
	@Override
	public int compare(A o1, A o2) {
		return o2.compareTo(o1);
	}
}

class A implements Comparable<A> {
	public A(String name) {
		this.name = name;
	}

	String name;

	@Override
	public int compareTo(A s) {
		// System.out.println(s);
		return name.compareTo(s.name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}