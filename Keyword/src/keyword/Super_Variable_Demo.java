package keyword;

public class Super_Variable_Demo {

	public static void main(String[] args) {
		VarBot bot = new VarBot();
		System.out.println(bot.top);
		bot.met();

	}

}
class VarTop{
	int top=40;
}
class VarMed extends VarTop{
	int top = 20;
}
class VarBot extends VarMed{
	int top=50;
	public void met() {
		System.out.println("Local...."+top);
		System.out.println("Parent..."+super.top);
	}
}