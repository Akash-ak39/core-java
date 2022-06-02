package oops;

public class Inherit_Demo5_Composition {

	public static void main(String[] args) {
		MeatWorld foods = new Biryani();
		System.out.println("Cost of Biryani...:"+foods.cost());
		foods = new Kebab(foods);
		System.out.println("Cost of Biryani and Kebab Together..:"+foods.cost());
		MeatWorld mymeat = new Kebab(new Tandoor(new Chinese()));  //[In One Object adding Multiple Object] this is Composition(inheritance)
		System.out.println("Cost of Kebab,Tandoor and Chinese...:"+mymeat.cost());  

	}

}

abstract class MeatWorld {
	public abstract int cost();
}

abstract class Chicken extends MeatWorld {

}

abstract class Beef extends MeatWorld {

}

abstract class pork extends MeatWorld {

}

class Biryani extends Chicken {
	MeatWorld meat;

	public Biryani() {

	}

	public Biryani(MeatWorld meat) {
		this.meat = meat;
	}

	@Override
	public int cost() {
		if (meat == null) {
			return 100;
		} else {
			return 100 + meat.cost();
		}
	}
}

class Kebab extends Chicken {
	MeatWorld meat;

	public Kebab() {

	}

	public Kebab(MeatWorld meat) {
		this.meat = meat;
	}

	@Override
	public int cost() {
		if (meat == null) {
			return 50;
		} else {
			return 50 + meat.cost();
		}
	}
}

class Tandoor extends Chicken {
	MeatWorld meat;

	public Tandoor() {

	}

	public Tandoor(MeatWorld meat) {
		this.meat = meat;
	}

	public int cost() {
		if (meat == null) {
			return 110;
		} else {
			return 110 + meat.cost();
		}
	}
}

class Chinese extends Chicken {
	MeatWorld meat;

	public Chinese() {

	}

	public Chinese(MeatWorld meat) {
		this.meat = meat;
	}

	public int cost() {
		if (meat == null) {
			return 80;
		} else {
			return 80 + meat.cost();
		}
	}
}
