package exception_handling;

public class Throwable_Demo_ {
	public static void main(String[] args) throws Throwable {
		System.out.println(new Dabba());
		YesBank yb = new YesBank();
		try {
			yb.withDraw(1000000);
		} catch (MaxLimitException e) {
			System.out.println(e);
			System.out.println("hashCode..:" + e.hashCode() + "@" + e.getClass().getName());
		}
		System.out.println("business continues...");
	}
}

class NoBank {
	public void withDraw(int amt) throws MaxlimitException {
		if (amt > 100000) {
			throw new MaxlimitException("The maximum limit is 1 lakh.........cant go for more...");
		}
	}
}

class MaxlimitException extends Throwable {
	String msg;

	public MaxlimitException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "This exception is...bla bla bla...." + msg;
	}
}

class Dabba {
	@Override
	public String toString() {
		return "daba raidu.....ni dabba raidu.....";
	}
}
