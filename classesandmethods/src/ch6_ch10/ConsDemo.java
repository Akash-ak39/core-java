package ch6_ch10;

public class ConsDemo {
	public ConsDemo() {
		System.out.println("Default Constructor called...");
	}
	public ConsDemo(int i) {
		System.out.println("Constructor with i value called..."+i);
	}
	public ConsDemo(Employee e) {
		System.out.println("Employee Constructor called");
	}
	
public static void main(String[] args) {
	new ConsDemo();
	
	new ConsDemo(28);
	
	new ConsDemo(new Employee());
}
}
class Employee{
	
}