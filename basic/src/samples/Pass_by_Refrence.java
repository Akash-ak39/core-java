package samples;

public class Pass_by_Refrence {

	public static void main(String[] args) {
		MyBank Iob = new MyBank();
		Kaasu my = new Kaasu();
		
		Iob.acceptMoney(my);
		Iob.TransferMoney(1000,new Account());

	}

}

	class MyBank {
	public void acceptMoney(Kaasu m) {
		
		
	}
	public void TransferMoney(int amt,Account acct) {
		acct.credit(5000);
		acct.debit(500);
	}
	
}
	
	class Kaasu{
		
	}
	
	class Account{
		public void debit(int deb) {
			System.out.println("debited.."+deb);
		}
		public void credit(int cred) {
			System.out.println("credited.."+cred);
		}
	}
