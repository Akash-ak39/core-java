package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringDemo11Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringDemo11Application.class, args);
		DressShop ds=ctx.getBean("Mshop",DressShop.class);
		System.out.println(ds.selldress());
	}

}
abstract class Dress{
	
}
abstract class Garments{
	@Autowired
	@Qualifier("RD")
	public abstract Dress makedress();
}
abstract class DressShop{
	private Garments garm;
	public Garments getgar() {
		return garm;
	}
	public void setgar(Garments garm) {
		this.garm=garm;
	}
	public abstract Dress selldress();
}
@Component
class Formal extends Dress{
	
}
@Component
class Casual extends Dress{
	
}
@Component("RD")
class Raymond extends Garments{
	public Raymond() {
		System.out.println("Object of Raymond is Created..");
	}
	@Override
	public Dress makedress() {
		// TODO Auto-generated method stub
		return new Formal();
	}
}
@Component("LD")
class Levis extends Garments{
	public Levis() {
		System.out.println("Object of Levis is Created..");
	}
	@Override
	public Dress makedress() {
		// TODO Auto-generated method stub
		return new Casual();
	}
}
@Component("Mshop")
class Menshow extends DressShop{
	public Menshow() {
		System.out.println("Object of MenShow is Created..");
	}
	@Override
	public Dress selldress() {
		// TODO Auto-generated method stub
		return getgar().makedress();
	}
}