package interfac;

public class F_Inter_Demo {

	public static void main(String[] args) {
//PART 1
		// Anonymous
		new FIntOne() {

			@Override
			public void met() {
				System.out.println("This Method is called Anonymous Method");

			}
		}.met();

		// Method Referencing
		FIntOne one = F_Inter_Demo::mymethod;
		one.met();

		// Lambda....!
		FIntOne oneLambda = () -> {
			System.out.println("Lambda is called....");
		};
		oneLambda.met();

		// General
		FIntOne common = new MyFint();
		common.met();
		System.out.println();
		
// PART 2
		// Anonymous
		int value = new FInttwo() {
			@Override
			public int met() {

				return 100;
			}
		}.met();
		System.out.println("Value of First inter...anonymous..: " + value);

		// Method Referencing
		FInttwo two = new F_Inter_Demo()::mymethod2;
		value = two.met();
		System.out.println("Value of first Inter-Method Refernce..: " + value);

		// Lambda
		FInttwo twolambda = () -> {return 2000;};
		value = twolambda.met();
		System.out.println("Value of first-Lambda..: " + value);

		//General
		FInttwo common2 = new MyFinttwo();
		value = common2.met();
		System.out.println("Value of first Inter --general..: "+value);
System.out.println();

//PART 3
		//Anonymous
		String val = new FIntthree() {
			@Override
			public String met(int i, String s) {
				// TODO Auto-generated method stub
				return i+":"+s;
			}
		}.met(10, "Anonymous");
		System.out.println("Value is..: "+val);
		
		//Method Reference
		FIntthree three = new F_Inter_Demo()::mymethod3;
		val = three.met(10,"Method Reference");
		System.out.println("Value is...: "+val);
		//Lambda
		FIntthree threeLambda = (int num,String str)->{return num + ":" +str;};
		val = threeLambda.met(101010, "Lambda Nation");
		System.out.println("Value is ..: "+val);
System.out.println();

//PART 4
		//Anonymous
		Account acc = new Account();
		acc.balance=1000;
		Account my = new FIntfour() {
			@Override
			public Account transfer (Account acc , int amt){
				acc.balance=(acc.balance-amt);
				return acc;
			}
		}.transfer(acc , 500);
		System.out.println("Balance ..:"+my.balance);
		
		//Method Referencing
		FIntfour four = new F_Inter_Demo()::mymethod4;
		Account ac =four.transfer(acc, 100);
		System.out.println("Method Reference..:"+ac.balance);
		
		//Lambda
		FIntfour fourlambda = (myc,amt)->{
			myc.balance=(myc.balance-amt);
			return myc;
		};
		ac = fourlambda.transfer(acc, 200);
		System.out.println("value Lambda..:"+ac.balance);
	}

	public static void mymethod() {
		System.out.println("My method is called using method reference..");
	}

	public int mymethod2() {
		return 1000;
	}
	public String mymethod3(int i, String s) {
		return i + " : " + s;
	}
	public Account mymethod4(Account acc,int amt) {
		acc.balance=(acc.balance-amt);
		return acc;
	}

}

class MyFint implements FIntOne {
	@Override
	public void met() {
		System.out.println("General method is called..");

	}
}

class MyFinttwo implements FInttwo {
	@Override
	public int met() {
		// TODO Auto-generated method stub
		return 100000;
	}
}

//Functional Interface -- Interfaces with only one Method
interface FIntOne {
	public void met();
}

interface FInttwo {
	public int met();
}
interface FIntthree{
	public String met(int i, String s);
}
interface FIntfour{
	public Account transfer(Account acc, int amt);
}

class Account{
	int balance;
}