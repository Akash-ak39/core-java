package oops;

public class InheritDemo4 {

	public static void main(String[] args) {
		///IndianElectronics ie = new IndianElectronics(AmericanBattery);
		GlobalRemote GR = new GlobalRemote();
		GlobalBattery gb = new GlobalBattery();
		AmericanRemote A = new HP();
	//	gb.coal(ie);
	}

}

abstract class IndianRemote {
	public abstract void lcd();
}

abstract class IndianBattery {
	public abstract void coal(IndianRemote ir);
}

abstract class AmericanRemote {
	public abstract void led();
}

abstract class AmericanBattery {
	public abstract void lithium(AmericanRemote ab);
}

class GlobalRemote extends IndianRemote {
	@Override
	public void lcd() {
		System.out.println("GlobalRemote is Working Good...");
	}
}

class GlobalBattery extends IndianBattery {
	@Override
	public void coal(IndianRemote ir) {
		ir.lcd();
	}
}

class IndianElectronics extends IndianRemote {
	AmericanRemote ab;

	public IndianElectronics() {

	}

	public IndianElectronics(AmericanRemote ab) {
		this.ab = ab;
	}

	@Override
	public void lcd() {
		ab.led();

	}

}
class HP extends AmericanRemote{
	@Override
	public void led() {
		System.out.println("american remote is working good..");
		
	}
}