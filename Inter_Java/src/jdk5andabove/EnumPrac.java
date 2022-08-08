package jdk5andabove;

public class EnumPrac {
	Day day;
	public EnumPrac(Day day) {
		this.day=day;
	}
	public void show() {
		switch (day) {
		case Monday:
			System.out.println("Mondays are lit bit lazy day..");
			break;
		case Tuesday:
			System.out.println("Tuesdays are silent killer..");
			break;
		case Friday:
			System.out.println("Fridays are excellent day..");
			break;
			default:
				System.out.println("Midweek days are buzzzzzz..");
				break;
		}
	}
	public static void main(String[] args) {
		EnumPrac one = new EnumPrac(Day.Monday);
		one.show();
		EnumPrac two = new EnumPrac(Day.Tuesday);
		two.show();
		EnumPrac three = new EnumPrac(Day.Friday);
		three.show();
		EnumPrac four = new EnumPrac(Day.Wednesday);
		four.show();
	}
}
