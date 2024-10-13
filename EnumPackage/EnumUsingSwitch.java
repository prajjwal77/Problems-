package EnumPackage;


enum Result1{
	PASS,FAIL,NR;
}
public class EnumUsingSwitch {

	public static void main(String[] args) {
		//Result1 r1 = Result1.PASS;
		Result1 r1 = Result1.FAIL;
	//	Result1 r1 = Result1.PASS;
		
		switch (r1) {
		case PASS:
			System.out.println("Passed!");
			break;
			
			case FAIL:
				System.out.println("Failed!");
				break;
		default:
			break;
		}
	}
}
