package programming1;

public class Sum_elements_Array {

	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,10};
		int sum = 0;
		//advanced for loop
		for(int num :array) {
			sum = sum+num;
		}
		System.out.println("sum of array elements is:"+sum);
	}

}
