package jdk5andabove;

import java.lang.reflect.Method;

public class Consumer {
public static void main(String[] args)throws Exception {
	Food food = new Food();
	
//	Veg veg = food.getClass().getAnnotation(Veg.class);
//	if(veg==null) {
//		System.out.println("this is non vegetarian food");
//	}else {
//		System.out.println("this is vegetarian food");
//	}
	
	Method m =food.getClass().getMethod("Mutton");
	Non_Veg vg = m.getAnnotation(Non_Veg.class);
	if(vg==null) {
		System.out.println("Rice is pure Vegetarian food");
	}else {
		System.out.println("Mutton is Non-Vegetarian food");
	}
}
}
