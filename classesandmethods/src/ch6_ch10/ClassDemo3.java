package ch6_ch10;

public class ClassDemo3 {
	public static void main(String[] args) {
		Bank sbi=new Bank();
		sbi.depositCash(5000);
		System.out.println(sbi.getamt());
		System.out.println(sbi.getname());
		System.out.println(sbi.depositCash(5000));
	}
}
class Bank{
	boolean depositCash(int amt) {
		if(amt>1000) {
			return true;
		}else {
			return false;
		}
	}
	float getamt() {
		return 10l;
	}
	String getname() {
		return"akash";
	}
}