package samples;

public class Parametrized_Cons {
	public static void main(String[] args) {
		Square mysq = new Square(10, 20, 05);
		Square mysq1 = new Square(5, 2, 3);

		int vol;
		vol = mysq.volume();
		System.out.println("volume is : " + vol);

		vol = mysq1.volume();
		System.out.println("volume is : " + vol);
	}

}

class Square {
	int width;
	int height;
	int depth;

	Square(int W, int H, int D) {
		width = W;
		height = H;
		depth = D;
	}

	int volume() {
		return width * height * depth;
	}
}
