import org.w3c.dom.ls.LSOutput;

class C{
	public void show() {
		System.out.println("In show");
	}
	static class B{
		public void display() {
			System.out.println("In Display");
		}
	}
}
public class InnerDemo2 {
	public static void main(String[] args) {
		C obj = new C();
		C.B obj1 = new C.B();
		
		obj.show();
		obj1.display();
	}
}
