package oops;

public class SameClass {
	private int pri;
	int nomod;
	protected int pro;
	public int pub;

	public void met() {
		System.out.println(pri);
		System.out.println(pub);
		System.out.println(nomod);
		System.out.println(pub);
	}
}

class SamePackNonSub {
	public void met() {
		SameClass obj = new SameClass();
		//System.out.println(obj.pri);//error
		System.out.println(obj.pub);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
	}
}

class SamePack extends SameClass {
	public void met() {
		//System.out.println(pri);//error
		System.out.println(pub);
		System.out.println(nomod);
		System.out.println(pub);
	}
}
