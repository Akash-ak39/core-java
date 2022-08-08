package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringDemo1Application.class, args);
		Shoeshop ss = ctxt.getBean("Ashop", Shoeshop.class);
		System.out.println(ss.sellshoe());
	}

}

abstract class shoe {

}

abstract class Factory {
	public abstract shoe makeshoe();
}

abstract class Shoeshop {
	@Autowired
	@Qualifier("Nsf")
	private Factory factory;

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public abstract shoe sellshoe();
}

@Component
class Leathershoe extends shoe {

}

@Component
class Sportsshoe extends shoe {

}

@Component("Nsf")
class Nikeshoefactory extends Factory {
	public Nikeshoefactory() {
		System.out.println("Nike Shoe Factory Object Created..");
	}

	@Override
	public shoe makeshoe() {
		// TODO Auto-generated method stub
		return new Sportsshoe();
	}
}

@Component("Wsf")
class Woodlandfactory extends Factory {
	public Woodlandfactory() {
		System.out.println("WoodLands shoe Factory Object Created..");
	}

	@Override
	public shoe makeshoe() {
		// TODO Auto-generated method stub
		return new Leathershoe();
	}
}

@Component("Ashop")
class Akshoeshop extends Shoeshop {

	public Akshoeshop() {
		System.out.println("Ak shoe shop  Object Created..");
		
	}

	@Override
	public shoe sellshoe() {
		System.out.println(getFactory());
		// TODO Auto-generated method stub
		return getFactory().makeshoe();
	}
}