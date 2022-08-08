package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Collection2 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("Akaaa");
		hs.add("kaaaa");
		hs.add("ashhh");
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove("kaaaa");
		System.out.println(hs);
		System.out.println(hs.size());

		System.out.println(hs.isEmpty());

		System.out.println(hs.contains("ashhh"));

		hs.forEach(Collection2::print);

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+"ka");
		}
	}

	static void print(String s) {
		System.out.println(s);
	}
}

class MConsumer implements Consumer<String> {// Consumer is an Interface class which is inbuild
	@Override
	public void accept(String s) {
		System.out.println(s);

	}
}