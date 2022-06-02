package samples;

public class Cons2 {
	public static void main(String[] args) {
		College col = College.createcollege();
		System.out.println(col);
		col = College.createcollege();
		System.out.println(col);
		col = College.createcollege();
		System.out.println(col);
		col = College.createcollege();
		System.out.println(col);
		col = College.createcollege();
		System.out.println(col);
		col = College.createcollege();
		System.out.println(col);
		col = College.createcollege();
		System.out.println(col);
		col = College.createcollege();
		System.out.println(col);
		col = College.createcollege();
		System.out.println(col);

	}
}

class College {
	private College() {
		System.out.println("School makes you as a rationalist person");
		//System.out.println();
	}

	static int count = 0;
	static College collegeone = new College();

	public static College createcollege() {
		if (count < 5) {
			count++;
			return new College();
		} else {
			return collegeone;
		}
	}
}
