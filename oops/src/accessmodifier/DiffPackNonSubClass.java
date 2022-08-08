package accessmodifier;

import oops.SameClass;

public class DiffPackNonSubClass {
	public void met() {
		SameClass obj = new SameClass();
		//System.out.println(obj.pri); // error
	    //System.out.println(obj.nomod);//error
		//System.out.println(obj.pro);//error
		System.out.println(obj.pub);
	}

}
class DiffPackSub extends SameClass{
	public void met() {
		//System.out.println(pri);//error
		//System.out.println(nomod);//error
		System.out.println(pub);
		System.out.println(pro);
	}
}
