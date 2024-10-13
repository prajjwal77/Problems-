package EnumPackage;

enum Week{
	MON,TUE,WEB,THU,FRI,SAT,SUN;
}
public class AboutEnum {

	enum Result{
		PASS,FAIL,NR;
	}
	public static void main(String[] args) {
		Week week =Week.MON;
		System.out.println(week);
		
		int index = Week.MON.ordinal();
		System.out.println(index);
		
		Week []wr = Week.values();
		for(Week w1 : wr) {
			System.out.println(w1 + " : "+ w1.ordinal());
		}
		
		Result result=Result.PASS;
		System.out.println(result);
	}
}
