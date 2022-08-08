package samples;

public class Pbv__Pbr_demo {

	public static void main(String[] args) {
		// simple type- pass by value
		int i = 100;
		int j = i;
		System.out.println(i);
		i = i+100;
		System.out.println(i);
		System.out.println(j);
		
		String str = "Hii ";
		String temp=str;
		
		str = str + "My Dear.....";
		System.out.println(str);
		System.out.println(temp);
		
		//complex type-pass by reference
		
		World w = new World();
		World tempw=w;
		w.size=10001;
		//tempw.size=100;
		System.out.println(w.size);
		System.out.println(tempw.size);

	}

}
	class World{
		int size=10;
	}
	
