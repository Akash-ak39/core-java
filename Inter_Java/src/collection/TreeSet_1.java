package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_1 {
	public static void main(String[] args) {
		//Ana a = new Ana();
		Set ts = new TreeSet(new Taki());
		ts.add(new A("akash"));
		ts.add(new A("seshan"));
		ts.add(new A("yuvan"));
		ts.add(new A("tamil"));
		System.out.println(ts);
		
	}

}
class K implements Comparable<A>{
	public K(String name) {
		this.name=name;
	}
	String name;
	@Override
	public int compareTo(A o) {
		System.out.println(o);
		return name.compareTo(o.name);
	}
}
class Taki implements Comparator<A>{
	String name;
	@Override
	public int compare(A o1, A o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
		}
}