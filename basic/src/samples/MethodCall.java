package samples;

public class MethodCall {

	public static void main(String[] args) {
		money obj = new money();
		obj.proff();
		obj.heist(200, 400000);

	}

}
	class money{
		
		void heist(int i,int j) {
			if(i<j) {
				System.out.println("kadhal enbathu mayavalai");
			}
			else {
			System.out.println("money is always ultimate");
			}
			}
		void proff() {
			System.out.println("Bella ciao");
		}
	}
