package keyword;
	//super key word refers - super class constructor,super class variable
	//super class method
public class Super_Keyword_Demo1 {

	public static void main(String[] args) {
		Medium mi = new Medium();
		mi.met();

	}

}
abstract class ToptopStar{
	public void met() {
		System.out.println("Top top met 1 method called");
	}
}
abstract class TopStar extends ToptopStar{
	public void met() {
		super.met();
		System.out.println("Top met 2 method called");
	}
}
abstract class Top extends TopStar{
	final public void met() {
		super.met();
		System.out.println("Top met sub 3 method called");
	}
}
class Medium extends Top{
	
}