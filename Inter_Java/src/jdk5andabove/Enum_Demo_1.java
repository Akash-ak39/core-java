package jdk5andabove;

public class Enum_Demo_1 {
	public static void main(String[] args) {
		System.out.println(Fruits.apple.details);
		met(Fruits.mango);
		
		System.out.println(Fruits.valueOf("apple").details);
		
		for(Fruits f:Fruits.values()) {
			System.out.println(f.details);
		}
		Fruits f=Fruits.grapes;
		switch(f) {
		case apple:{
			System.out.println("this is apppppppppppppppppppppppppppppppppp");
			break;
		}
		case mango:{
			System.out.println("this is maannnngggggggggggggggggggggggggggg");
			break;
		}
		default:{
			System.out.println("all your sins are forgiven....");
		}
		
		}
	}
	
	public static void met(Fruits fruit)
	{
		System.out.println(fruit);
	}
}

