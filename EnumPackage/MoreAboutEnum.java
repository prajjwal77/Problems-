package EnumPackage;
enum Result{
	PASS,FAIL,NR;
	
	int marks;
	
	Result() {
		System.out.println("Constructor in Enum");
	}
	
	void setMarks(int marks) {
		this.marks=marks;
	}
	
	int getmarks() {
		return marks;
	}
}
public class MoreAboutEnum {
	public static void main(String[] args) {
		 Result.PASS.setMarks(50);
		 int m1= Result.PASS.getmarks();	
		 System.out.println(m1);
	}
	
	
	
}
