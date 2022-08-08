package samples;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("Hyy");// this will create two objects
		String str2= "Hyy";// this will create one object
		
		System.out.println(str==str2);// this will compare the objects not value
		System.out.println(str.equals(str2));// equal method compare values
		
		if(str.equals(str2)) {
			System.out.println("both are equal");
		}
		
		String v =String.format("My name is...%s","Ak");
		
		System.out.println(v);
		
		v=String.format("My name is ...%s and My age is..%d","Ak",20);
		
		System.out.println(v);
		
v=String.format("My name is is ..:%s and my age is..:%d and my weight is..:%f","Akash",21,99.5f);
		
		System.out.println(v);
		
		System.out.printf("My name is is ..:%s and my age is..:%d and my weight is..:%f","Alfredo",21,90.50f);
		System.out.printf("\n%-20s%-20s%-20s","SI No","Name","Company");
		System.out.printf("\n%-20s%-20s%-20s","03","Akash","QIC");

	}

}
