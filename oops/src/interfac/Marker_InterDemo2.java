package interfac;

public class Marker_InterDemo2 {
	public static void main(String[] args) {
		CorporationIDCard ourstudents=new CorpStudent();
		ConventIDCard students2=new ConventStudent();
		
		Marker_InterDemo2 camp=new Marker_InterDemo2();
		camp.luxuryRoom(students2);
		camp.ordinaryRoom(ourstudents);
		camp.mess((ConventIDCard)ourstudents);
	}
	
	public void luxuryRoom(ConventIDCard cid) {
		
	}
	public void ordinaryRoom(CorporationIDCard cic) {
		
	}
	public void mess(ConventIDCard cid) {
		
	}
}
interface CorporationIDCard{
	
}
interface ConventIDCard{
	
}
class CorpStudent implements CorporationIDCard,ConventIDCard{
	
}
class ConventStudent implements ConventIDCard{
	
}



